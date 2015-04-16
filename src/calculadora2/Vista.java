/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calculadora2;

import javax.swing.JOptionPane;

/**
 *
 * @author sbenavidesvazquez
 */
public class Vista {
    
    public static void imprimir(Modelo res){
        JOptionPane.showMessageDialog(null, res.num1+""+res.operacion+""+res.num2+" = "+res.resultado);
    }
    
}
