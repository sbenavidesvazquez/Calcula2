/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calculadora2;

import static calculadora2.Vista.imprimir;
import javax.swing.JOptionPane;

/**
 *
 * @author sbenavidesvazquez
 */
public class Calculadora2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Modelo contenedor=new Modelo();
        
        float n1=Float.parseFloat(JOptionPane.showInputDialog("Número 1"));
        contenedor.setNum1(n1);
        
        float n2=Float.parseFloat(JOptionPane.showInputDialog("Número 2"));
        contenedor.setNum2(n2);
        
        String op=JOptionPane.showInputDialog("Escoge la operacion\n "
                + "suma +\n"
                + "resta -\n"
                + "multiplicación *\n"
                + "división /\n");
        contenedor.setOperacion(op);
        
        float res=realizaOperacion(contenedor.getNum1(),contenedor.getNum2(),contenedor.getOperacion());
        contenedor.setResultado(res);
        
        Vista.imprimir(contenedor);
        
    }
    
    public static float realizaOperacion(float n1,float n2,String op){

        float resultado=0;
        switch(op){
            case "+":resultado=(n1+n2);
                break;
            case "-": resultado=(n1-n2);
                break;
            case "*": resultado=(n1*n2);
                break;
            case "/": resultado=(n1/n2);
                break;
        }
        return resultado;
    }
    
}
