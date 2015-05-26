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
        System.out.println("Suma");
        float n1 = 5.0F;
        float n2 = 2.0F;
        String op = "+";
        float expResult = 7.0F;
        float result = Calculadora2.realizaOperacion(n1, n2, op);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        System.out.println("Resta");
        float n3=7.0F;
        float n4=4.0F;
        String op2="-";
        float expResult2=3.0F;
        float result2 = Calculadora2.realizaOperacion(n3, n4, op2);
        assertEquals(expResult2, result2, 0.0);
        
        System.out.println("Multiplicar");
        float n5=3.0F;
        float n6=10.0F;
        String op3="*";
        float expResult3=30.0F;
        float result3= Calculadora2.realizaOperacion(n5, n6, op3);
        assertEquals(expResult3, result3, 0.0);
        
        System.out.println("Dividir");
        float n7=4.0F;
        float n8=2.0F;
        String op4="/";
        float expResult4=2.0F;
        float result4 = Calculadora2.realizaOperacion(n7, n8, op4);
        assertEquals(expResult4, result4, 0.0);
    }
    
}
