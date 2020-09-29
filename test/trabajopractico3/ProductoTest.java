/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajopractico3;

import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Gonzalo
 */
public class ProductoTest {
    Date fechaactual = new Date();
    //ProductoNom, double ProductoPrecio, String ProductoDescripcion, int ProductoStock, int ProductoModelo, Date ProductofchIngreso
//    Producto prod1 = new Producto("Playstation 5", 80000, "Con dos Joystink", 50, 1, fechaactual);
//    Producto prod2 = new Producto("Notebook", 80000, "Intel i7", 50, 2, fechaactual);
    Producto prod3 = new Producto("Playstation 5", 100000, "Con dos Joystink", 50, 7, fechaactual);
//        Producto prod3 = new Producto("Notebook", 80000, "Intel i7", 50, 2, fechaactual);
    public ProductoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getProductoId method, of class Producto.
     */
    //Carlos Lauria
    @Test
    public void testvalidaNombreNoSeaVacio() {
        prod3.setProductoNom("Playstation 5");
        boolean expResult = true;
        boolean result = Producto.validaNombreNoSeaVacio(prod3);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testValidaDescripcionNoSeaVacio() {
        prod3.setProductoDescripcion("Con un Joystink");
        boolean expResult = true;
        boolean result = Producto.validaDescripcionNoSeaVacio(prod3);
        assertEquals(expResult, result);
    }
    
    //Mauricio Campos
    @Test
    public void testValidaPrecioNoSeaMenorIgualACero() {
        boolean expResult = true;
        prod3.setProductoPrecio(100000);
        boolean result = Producto.validaPrecioNoSeaMenorIgualACero(prod3);
        assertEquals(expResult, result);
    }
    @Test
    public void testValidaStockMayorIgualACero() {
        boolean expResult = true;
        prod3.setProductoStock(100);
        boolean result = Producto.validaStockMayorIgualACero(prod3);
        assertEquals(expResult, result);
    }
    //Pamela Casilla
    @Test
    public void testValidaModeloMayorIgualACero() {
        boolean expResult = true;
        prod3.setProductoModelo(10);
        boolean result = Producto.validaModeloMayorIgualACero(prod3);
        assertEquals(expResult, result);
    }
    @Test
    public void testValidaFechaMenorAFechaActual() {
        boolean expResult = true;
        prod3.setProductofchIngreso(fechaactual);
        boolean result = Producto.fechaProductoEsMenorALaFechaActual(prod3);
        assertEquals(expResult, result);
    }
    
}
