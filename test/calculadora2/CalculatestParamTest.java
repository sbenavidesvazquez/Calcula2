/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calculadora2;

import java.util.Arrays;
import java.util.Collection;
import static junit.framework.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author sbenavidesvazquez
 */
@RunWith(Parameterized.class)
public class CalculatestParamTest {
    private Integer inputnum1;
    private Integer inputnum2;
    private String inputop;
    private float resultesp;
    private Calculadora2 calculo;
    
    
   @Before
   public void initialize() {
      calculo = new Calculadora2();
   }
   
   public CalculatestParamTest(Integer inputnum1, 
      Integer inputnum2,String inputop,float resultesp) {
      this.inputnum1 = inputnum1;
      this.inputnum2 = inputnum2;
      this.inputop=inputop;
      this.resultesp=resultesp;
   }
   
   @Parameterized.Parameters
   public static Collection primeNumbers() {
      return Arrays.asList(new Object[][] {
         { 2,2,"+",4},
         { 7, 2,"-", 5},
         { 6,4,"*",24 },
         { 8,2,"/",4 }
      });
   }
   
   @Test
   public void testPrimeNumberChecker() {
      System.out.println("Parameterized Number is : " + inputnum1+inputop+inputnum2);
      assertEquals(resultesp, 
      Calculadora2.realizaOperacion(inputnum1, inputnum2, inputop));
   }
}
