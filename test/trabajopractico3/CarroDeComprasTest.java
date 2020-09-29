package trabajopractico3;

import java.util.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class CarroDeComprasTest {

    Date fechaactual = new Date();

    Producto prod1 = new Producto("Playstation 5", 80000, "Con dos Joystink", 50, 1, fechaactual);
    Producto prod2 = new Producto("Notebook", 80000, "Intel i7", 50, 2, fechaactual);
    Producto prod3 = new Producto("Tablet", 10000, "5 gb de memoria", 10, 3, fechaactual);
    Producto prod4 = new Producto("Smart TV", 60000, "Ultra Definicion", 50, 4, fechaactual);
    Producto prod5 = new Producto("Celular", 25000, "Motorola G5", 5, 5, fechaactual);
    Cliente cliente1 = new Cliente("Pamela", "Casilla", 18, 37519314, "2615568398");
    DetalleCarro detalle1 = new DetalleCarro(prod1, 5);
    CarroDeCompras carrito = new CarroDeCompras(150000, detalle1);

    public CarroDeComprasTest() {
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
     * Test of TestValidaStockNoSeaMenorIgualCero method, of class CarroDeCompras.
     */
    //Gonzalo Carbajal
    @Test
    public void testValidaStockNoSeaMenorIgualCero() {
        prod3.setProductoStock(5);
        boolean expResult = true;
        boolean result = CarroDeCompras.stockNoSeaMenorIgualCero(prod3);
        assertEquals(expResult, result);
    }

    @Test
    public void testValidaCantidadNoSeaMenorIgualCero() {
        CarroDeCompras cd = carrito;
        boolean expResult = true;
        boolean result = CarroDeCompras.cantidadNoSeaMenorIgualCero(cd);
        assertEquals(expResult, result);
    }
}