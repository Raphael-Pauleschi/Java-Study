/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula2;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author raphael_ferraiolo
 */
public class Pessoa {
    Scanner input = new Scanner(System.in);
    String nome;
    int idade;
    double renda;
    
    Pessoa(){
        String dados;
        JOptionPane.showMessageDialog(null,"O construtor foi acionado! \nEntre com os dados");
        nome = JOptionPane.showInputDialog("Digite o nome:");
        dados = JOptionPane.showInputDialog("Digite a idade:");
        idade = Integer.parseInt(dados);
        dados = JOptionPane.showInputDialog("Digite a renda:");
        renda = Double.parseDouble(dados);
        input.close();
    }
    
    Pessoa(String n, int i, double r){
        nome = n;
        idade = i;
        renda = r;
    }
    
    public void mostra_dados(){
        JOptionPane.showMessageDialog(null,"Dados da Pessoa"
                +"\nNome: "+nome+"\nIdade: "+idade+"\nRenda: "+renda);
    
}
    
}
