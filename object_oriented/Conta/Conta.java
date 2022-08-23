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
public class Conta {
    String numero;
    double saldo;
    
    //Construtor
    Conta(String n, double saldo){
        numero=n;
        this.saldo = saldo;
    }
    
    //Metódos
    void imprimeDados(){
        JOptionPane.showMessageDialog(null,"Dados da Conta"+
                "\nNúmero: "+numero+
                "\nSaldo: "+saldo);
    }
    void sacarValor(double valor){
        if(valor>saldo)
            JOptionPane.showMessageDialog(null,"Saldo insuficiente");
        else
             saldo= saldo - valor;       
    }
    public double maiorSaldo(Conta c){
        if(this.saldo>c.saldo)
           return this.saldo;
        else
            return c.saldo;
        
    }
    
}
