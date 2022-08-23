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
public class Produto {
    private int codigo;
    private String descricao;
    private float valor;

    public Produto() {
    }
    public Produto(int codigo, String descricao, float valor) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.valor = valor;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    
    public void print(){
        JOptionPane.showMessageDialog(null,"Id: "+codigo+"\nDescrição: "+descricao+"\nValor: R$"+valor);
    }
    
    
    
}
