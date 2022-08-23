/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula3A;
import javax.swing.JOptionPane;
/**
 *
 * @author dti
 */
public class TestaClasse {
    public static void main (String[] args){
        Produto p;
    
        String marca;
        float valor, valorImp, porc;
    
        marca = JOptionPane.showInputDialog("Digite a marca do produto:");
        valor = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do produto:"));
    
        p = new Produto(marca, valor);
        porc = Float.parseFloat(
                JOptionPane.showInputDialog("Digite a porcentagem de imposto"));
        valorImp = p.calculaImposto(porc);
        JOptionPane.showMessageDialog(null,"Imposto a pagar: "+valorImp);
    }
}
