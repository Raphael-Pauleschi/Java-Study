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
public class Torneio {
    private String nome;
    private int idade;
    
    Torneio(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    public String getNome(){
        return nome;
    }
    public int getIdade(){
        return idade;
    }
    public void setNome(String n){
        nome = n;
    }
    public void setIdade(int i){
        idade = i;
    }
    public String verificaCategoria(){
        if (idade >= 5 && idade <= 7)
            return "Infantil";
        else if (idade <= 10)
            return "Juvenil";
        else if (idade <= 15)
            return "Adolescente";
        else if (idade <= 30)
            return "Adulto";
        else
            return "Senior";      
    }
    public void imprimeDados(){
        JOptionPane.showMessageDialog(null, "Dados do participante: "+
                "\nNome: "+nome+"\nIdade: "+idade+"\nCategoria: "+verificaCategoria());
    }
    
}
