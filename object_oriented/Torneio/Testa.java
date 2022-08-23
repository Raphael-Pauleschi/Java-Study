/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula5;
import javax.swing.JOptionPane;

/**
 *
 * @author dti
 */
public class Testa {
    public static void main(String args[]){
       int control = 1;
        
       if (control == 1){
           float vendas, salario;
           String nomeV;
           int falta;
           
          
           nomeV = JOptionPane.showInputDialog("Entre com o nome");
           salario = Float.parseFloat(JOptionPane.showInputDialog("Entre com o salario"));
           vendas = Float.parseFloat(JOptionPane.showInputDialog("Entre com as vendas"));
           falta = Integer.parseInt(JOptionPane.showInputDialog("Entre com as faltas"));
           Vendedor v1 = new Vendedor(vendas, salario, nomeV, falta);
           v1.calcularSalario();v1.imprimirDados();
           
       }
        
        
        
        if (control == 2){
        int idade;
        String nomeT;
        
        Torneio t1 = new Torneio("Dudão", 13);
        idade = Integer.parseInt(JOptionPane.showInputDialog("Entre com a idade:"));
        nomeT = JOptionPane.showInputDialog("Entre com o nome");
        
        
        Torneio t2 = new Torneio(nomeT, idade);
        
        t1.imprimeDados();
        t2.imprimeDados();
        }
    }
    
}
