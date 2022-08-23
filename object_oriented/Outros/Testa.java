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
public class Testa {
    public static void main(String[] args){
        int control;
        control = Integer.parseInt(JOptionPane.showInputDialog("Entre com o valor do exercício: "+
                "\n1 - Mês \n2 - Maior que a soma \n3 - Multa "+
                "\n4- Ordem Crescente \n5- Ano bissexto \nOutro - Sair"));
        switch(control){
           case 1:
               Mes m1 = new Mes(); 
               m1.nomeMes();
           break;
           case 2:
               Fracao f = new Fracao();
               f.estado();
           break;
           case 3:
               Multa mu = new Multa();
               mu.seraMultado(); 
           break;
           case 4:
               Crescente c = new Crescente();
               c.escrita();
           break;
           case 5:
               Ano a = new Ano();
               a.bissexto();
           break;    
           default:
            JOptionPane.showMessageDialog(null,"Fim do programa");
                 
         }
    }
    
}
