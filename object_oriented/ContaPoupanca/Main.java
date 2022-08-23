/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conta;
import javax.swing.JOptionPane;
/**
 *
 * @author dti
 */
public class Main {
     public static void main (String[] args){
         ContaPoupanca cp;
         float valorDep, rend, saldo, taxa;
         String agencia, num;
         
         agencia = JOptionPane.showInputDialog("Digite o número da agência");
         num = JOptionPane.showInputDialog("Digite o número da conta poupança:");
         saldo = Float.parseFloat(JOptionPane.showInputDialog("Digite o saldo:"));
         taxa = Float.parseFloat(JOptionPane.showInputDialog("Digite a taxa do saldo"));
         
         
         
         cp = new ContaPoupanca (agencia, num , saldo, taxa);
         //Utilizando os métodos
         cp.imprimeDados();
         rend = cp.calculaRendimento();
         JOptionPane.showMessageDialog(null, "O rendimento é:"+rend);
         valorDep = Float.parseFloat(
                 JOptionPane.showInputDialog("Digite o valor a ser depositado:"));
         cp.depositar(valorDep);
         cp.imprimeDados();
                 
         
     }
}
