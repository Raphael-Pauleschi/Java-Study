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
public class Roupa extends Vestuario{
    private String tecido;

    public Roupa() {
    }

    public Roupa(String tecido, String nome, String cor, String tamanho, int codigo, String descricao, float valor) {
        super(nome, cor, tamanho, codigo, descricao, valor);
        this.tecido = tecido;
    }

    public String getTecido() {
        return tecido;
    }

    public void setTecido(String tecido) {
        this.tecido = tecido;
    }
    
    @Override
     public void print(){
        JOptionPane.showMessageDialog(null,"Id: "+getCodigo()+"\nDescrição: "+getDescricao()+"\nValor: R$"+getValor()
                +"\n\nInformações: \nNome: "+getNome()+"\nCor: "+getCor()+"\nTamanho: "+getTamanho()
                +"\n\nComposição \nTecido: "+tecido);
    }    
    
    
}
