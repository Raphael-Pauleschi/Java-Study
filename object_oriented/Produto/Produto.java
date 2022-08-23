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
public class Produto {
    String marca;
    float valor;
    
    Produto(){}
    Produto(String m, float v){
        marca = m;
        valor = v;
    }
    void imprimeDados(){
        JOptionPane.showMessageDialog(null, "Dados do Produto:"+
                "\nMarca: "+marca+
                "\nValor: "+valor);
    }
    float calculaImposto(float p){
        return valor*p/100;
    }
}
