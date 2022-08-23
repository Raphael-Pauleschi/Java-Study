/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula4c;
import javax.swing.JOptionPane;
/**
 *
 * @author dti
 */
public class Ano {
    int ano;
    
    Ano(){
        ano = Integer.parseInt(JOptionPane.showInputDialog("Entre com o ano:"));
    }
    void bissexto(){
        if ((ano % 400) == 0)
            JOptionPane.showMessageDialog(null,"O ano é bissexto");
        else if((ano % 4) == 0 && (ano % 100) != 0)
            JOptionPane.showMessageDialog(null,"O ano é bissexto");
        else
            JOptionPane.showMessageDialog(null,"O ano não é bissexto");
            
            
    }
}
