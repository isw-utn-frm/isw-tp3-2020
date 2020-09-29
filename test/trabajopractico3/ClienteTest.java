/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajopractico3;

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
public class ClienteTest {
    
    Cliente cliente1 = new Cliente("Gonzalo", "Carbajal", 27, 37519314, "2615568398");
    Cliente cliente2 = new Cliente("Quique", "Carbajal", 27, 37519314, "2615568398");
    
    public ClienteTest() {
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
     * Test of valida_que_el_nombre_no_tenga_caracteres_especiales method, of class Cliente.
     */
    //Facundo Bengoa
    @Test
    public void testValidaValidaQueElNombreNoTengaCaracteresEspeciales() {
        cliente1.setClienteNom("Maury");
        boolean expResult = true;
        boolean result = Cliente.validaQueElNombreNoTengaCaracteresEspeciales(cliente1);
        assertEquals(expResult, result);
    }
    @Test
    public void testValidaEdadMayorADieciocho() {
        cliente1.setClienteEdad(20);
        boolean expResult = true;
        boolean result = Cliente.validaEdadMayorADieciocho(cliente1);
        assertEquals(expResult, result);
    }
    //Enrique Vega
     @Test
    public void testValidaQueElTelefonoSoloTengaCaracteresNumericos() {
        cliente2.setClienteCelular("261398568");
        boolean expResult = true;
        boolean result = Cliente.queElTelefonoSoloTengaCaracteresNumericos(cliente2);
        assertEquals(expResult, result);
    }
    
    
    @Test
    public void testValidaCelularNoSeaVacio() {
        boolean expResult = true;
        cliente1.setClienteCelular("2615568398");
        boolean result = Cliente.validaCelularNoSeaVacio(cliente1);
        assertEquals(expResult, result);
    }

    //Gabriela Ochoa
    @Test
    public void testValidaDniNoSeaVacio() {
        boolean expResult = true;
        cliente2.setClienteDNI(37519314);
        boolean result = Cliente.validaDniNoSeaVacio(cliente2);
        assertEquals(expResult, result);
    }

    
    @Test
    public void testValidaNomApeNoSeaVacio() {
        boolean expResult = true;
        cliente2.setClienteNom("Gonzalo");
        cliente2.setClienteApe("Carbajal");
        boolean result = Cliente.validaNomApeNoSeaVacio(cliente2);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testValidaExistaPorLoMenosUnaInstanciaDeCliente() {
        boolean expResult = true;
        boolean result = Cliente.validaQueExistaPorLoMenosUnaInstanciaCliente();
        assertEquals(expResult, result);
    }
}
