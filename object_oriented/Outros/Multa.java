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
public class Multa {
    int carroKM, ruaKM;
    int diferenca;
    
    Multa(){
               carroKM = Integer.parseInt(JOptionPane.showInputDialog("Entre com a velocidade do carro"));
               ruaKM = Integer.parseInt(JOptionPane.showInputDialog("Entre com a velociade máxima da rua"));
    }           
    void seraMultado(){
               diferenca = carroKM - ruaKM;
               if (diferenca > 30)
                   JOptionPane.showMessageDialog(null,"Sua multa é de R$300,00");
               else if(diferenca >11)
                   JOptionPane.showMessageDialog(null,"Sua multa é de R$100,00");
               else if(diferenca>0)
                   JOptionPane.showMessageDialog(null,"Sua multa é de R$50,00");
               else
                   JOptionPane.showMessageDialog(null,"Não há multa");
    }
}
