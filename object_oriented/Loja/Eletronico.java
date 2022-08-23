/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula5b;

import javax.swing.JOptionPane;

/**
 *
 * @author dti
 */
public class Eletronico extends Produto {
    private int voltagem;

    public Eletronico() {
    }

    public Eletronico(int codigo, String descricao, float valor, int voltagem) {
        super(codigo, descricao, valor);
        this.voltagem = voltagem;
    }

    public int getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(int voltagem) {
        this.voltagem = voltagem;
    }
    
    @Override
     public void print(){
        JOptionPane.showMessageDialog(null,"Id: "+getCodigo()+"\nDescrição: "+getDescricao()+"\nValor: R$"+getValor()+"\nVoltagem: "+voltagem);
    }
    
    
    
    
}
