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
public class Vestuario extends Produto {
    private String nome;
    private String cor;
    private String tamanho;

    public Vestuario() {
    }

    public Vestuario(String nome, String cor, String tamanho, int codigo, String descricao, float valor) {
        super(codigo, descricao, valor);
        this.nome = nome;
        this.cor = cor;
        this.tamanho = tamanho;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }
    
    

  
    
    @Override
     public void print(){
        JOptionPane.showMessageDialog(null,"Id: "+getCodigo()+"\nDescrição: "+getDescricao()+"\nValor: R$"+getValor()
                +"\nInformações: \nNome: "+nome+"\nCor: "+cor+"\nTamanho: "+tamanho);
    }
    
    
    
}
