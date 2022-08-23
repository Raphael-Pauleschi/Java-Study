/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula4;
import javax.swing.JOptionPane;
/**
 *
 * @author dti
 */
public class TesteConta {
    public static void main(String[] args){
        Conta c = new Conta("1234",1000.50);
        Conta c1 = new Conta("1222",2050.45);
        
        c.imprimeDados();
        c.sacarValor(500.50);
        c.imprimeDados();
        c.sacarValor(700);
        JOptionPane.showMessageDialog(null,"Maior saldo: "+c.maiorSaldo(c1));
                
    }
    
}
