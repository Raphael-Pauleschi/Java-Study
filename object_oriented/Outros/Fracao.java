/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula4c;

import javax.swing.JOptionPane;

/**
 *
 * @author dti
 */
public class Fracao {
    int a1,a2;
               int b1,b2;
               int c1,c2;
               float f1,f2,f3;
               float soma;
               
    Fracao(){
      a1 = Integer.parseInt(JOptionPane.showInputDialog("Entre com o numerador da fração 1:"));
      a2 = Integer.parseInt(JOptionPane.showInputDialog("Entre com o denominador da fração 1:"));
      f1 = a1/a2;
      b1 = Integer.parseInt(JOptionPane.showInputDialog("Entre com o numerador da fração 2:"));
      b2 = Integer.parseInt(JOptionPane.showInputDialog("Entre com o denominador da fração 2:"));
      f2 = b1/b2;
      c1 = Integer.parseInt(JOptionPane.showInputDialog("Entre com o numerador da fração 3:"));
      c2 = Integer.parseInt(JOptionPane.showInputDialog("Entre com o denominador da fração 3:"));
      f3 = c1/c2;
      
      soma = f2+f3;
}
   
    public void estado(){
     if (f1 > soma)
         JOptionPane.showMessageDialog(null,"A 1° fração é maior que a soma");
     else if(f1 == soma)
           JOptionPane.showMessageDialog(null,"A 1° fração é igual a soma"); 
      else
           JOptionPane.showMessageDialog(null,"A 1° fração é menor que a soma");

}
}
