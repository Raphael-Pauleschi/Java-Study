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
public class Calcado extends Vestuario {
    private String materialSola;
    private String materialParteSuperior;
    private String materialInterno;

    public Calcado() {
    }

    public Calcado(String materialSola, String materialParteSuperior, String materialInterno, String nome, String cor, String tamanho, int codigo, String descricao, float valor) {
        super(nome, cor, tamanho, codigo, descricao, valor);
        this.materialSola = materialSola;
        this.materialParteSuperior = materialParteSuperior;
        this.materialInterno = materialInterno;
    }
    


    public String getMaterialSola() {
        return materialSola;
    }

    public void setMaterialSola(String materialSola) {
        this.materialSola = materialSola;
    }

    public String getMaterialParteSuperior() {
        return materialParteSuperior;
    }

    public void setMaterialParteSuperior(String materialParteSuperior) {
        this.materialParteSuperior = materialParteSuperior;
    }

    public String getMaterialInterno() {
        return materialInterno;
    }

    public void setMaterialInterno(String materialInterno) {
        this.materialInterno = materialInterno;
    }
    
    @Override
     public void print(){
        JOptionPane.showMessageDialog(null,"Id: "+getCodigo()+"\nDescrição: "+getDescricao()+"\nValor: R$"+getValor()
                +"\n\nInformações: \nNome: "+getNome()+"\nCor: "+getCor()+"\nTamanho: "+getTamanho()
                +"\n\nComposição \nSola: "+materialSola+"\nSuperior: "+materialParteSuperior+"\nInterno: "+materialInterno);
    }
    
    
}
