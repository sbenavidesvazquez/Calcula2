/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calculadora2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sbenavidesvazquez
 */
public class Calculadora2Test {
    
    public Calculadora2Test() {
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
     * Test of realizaOperacion method, of class Calculadora2.
     */
    @Test
    public void testRealizaOperacion() {
        System.out.println("realizaOperacion");
        float n1 = 5.0F;
        float n2 = 2.0F;
        String op = "*";
        float expResult = 10.0F;
        float result = Calculadora2.realizaOperacion(n1, n2, op);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
