/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package triangulo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Agustin
 */
public class TrianguloTest {
    
    public TrianguloTest() {
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
     * Test of evaluar method, of class Triangulo.
     */
    @Test
    public void testEvaluarNoEsTriangulo() {
        System.out.println("evaluar \"No es un triángulo\"");
        Triangulo instance = new Triangulo(3.0, 4.0, 10.0);
        String expResult = "No es un triángulo";
        String result = instance.evaluar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testEvaluarEscaleno() {
        System.out.println("evaluar \"Escaleno\"");
        Triangulo instance = new Triangulo(2.0, 3.0, 4.0);
        String expResult = "Escaleno";
        String result = instance.evaluar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testEvaluarIsosceles1() {
        System.out.println("evaluar \"Isósceles 1\"");
        Triangulo instance = new Triangulo(2.0, 3.0, 3.0);
        String expResult = "Isósceles";
        String result = instance.evaluar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testEvaluarIsosceles2() {
        System.out.println("evaluar \"Isósceles 2\"");
        Triangulo instance = new Triangulo(3.0, 2.0, 3.0);
        String expResult = "Isósceles";
        String result = instance.evaluar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testEvaluarIsosceles3() {
        System.out.println("evaluar \"Isósceles 3\"");
        Triangulo instance = new Triangulo(3.0, 3.0, 2.0);
        String expResult = "Isósceles";
        String result = instance.evaluar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testEvaluarEquilatero() {
        System.out.println("evaluar \"Equilátero\"");
        Triangulo instance = new Triangulo(3.0, 3.0, 3.0);
        String expResult = "Equilátero";
        String result = instance.evaluar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}