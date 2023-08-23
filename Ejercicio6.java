/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6;

import javax.swing.JOptionPane;

/**
 *
 * @author Aprendiz
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Definir variables 
        int num1, num2, num3, opcion;
     //inicializar variables 
     num1=0; num2=0; num3=0; opcion=0;
     //digitar datos 
      num1=Integer.parseInt(JOptionPane.showInputDialog("digite el primer numero  "));
      num2=Integer.parseInt(JOptionPane.showInputDialog("digite el segundo numero  "));
      num3=Integer.parseInt(JOptionPane.showInputDialog("digite el tercer numero "));
      opcion=Integer.parseInt(JOptionPane.showInputDialog(" 1.el numero mayor\n" + "2.el numero medio\n"  + "3. el numero menor\n "));
      switch (opcion){
          case 1: 
             if (num1>num2 && num1>num3){
                 JOptionPane.showMessageDialog(null, "el numero mayor es: "+num1);
    }if (num2>num1 && num2>num3){
         JOptionPane.showMessageDialog(null, "el numero mayor es: "+num2);
    }if (num3>num1 && num3>num2){
        JOptionPane.showMessageDialog(null, "el numero mayor es: "+ num3);
    } 
    break;
          case 2: 
              if (num1>num2){ 
                    if (num1<num3){
                 JOptionPane.showMessageDialog(null, " el numero medio es: "+num1);
                    }
                }
                if (num1>num3){ 
                    if (num1<num2){
                 JOptionPane.showMessageDialog(null, "el numero medio es: "+num1);
                    }
                }

                if (num2>num1){ 
                    if (num2<num3){
                 JOptionPane.showMessageDialog(null, "el numero medio es: "+num2);
                    }
                }
                if (num2>num3){ 
                    if (num2<num1){
                 JOptionPane.showMessageDialog(null, "el numero medio es: "+num2);
                    }
                }

                if (num3>num1){ 
                    if (num3<num2){
                 JOptionPane.showMessageDialog(null, "el numero medio es:"+num3);
                    }
                }
                if (num3>num2){ 
                    if (num3<num1){
                 JOptionPane.showMessageDialog(null, "el numero medio es:"+num3);
                    }
                }
                break;
               case 3:
           
                    if (num1<num2 && num1<num3){
               JOptionPane.showMessageDialog(null, "el numero menor es:  " +num1);
               }if (num2<num1 && num2<num3){
               JOptionPane.showMessageDialog(null, "el numero menor es: "+num2);
               }if (num3<num1 && num3<num2) {
               JOptionPane.showMessageDialog(null, "el numero menor es:"+num3);
                       }
               break;
              
    
      
      
    
}
      }
    }
