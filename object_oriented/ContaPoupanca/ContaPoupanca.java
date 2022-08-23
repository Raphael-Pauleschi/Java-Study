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
public class ContaPoupanca {
    String agencia;
    String numero;
    float saldo;
    float taxa;
    
    ContaPoupanca(){}
    ContaPoupanca(String agencia, String numero, float saldo, float taxa){
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
        this.taxa = taxa;
    }
    void imprimeDados(){
       JOptionPane.showMessageDialog(null,"Dados da conta:"
                +"\nAgencia: "+agencia+"\nNumero: "+numero+"\nSaldo: "+saldo
               +"\nTaxa: "+taxa);
    }
    void depositar(float valor){
        saldo = saldo + valor;
    }
    float calculaRendimento(){
        float rendimento;
        rendimento = saldo* taxa/100;
        return rendimento;
    }
    
    
    
}

