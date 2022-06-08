/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula2b;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author raphael_ferraiolo
 */
public class TesteClasses {
    public static void main(String args[]){
        String n,d;
        float s,l;
        char ti;
        
        Random gera = new Random();
        Triangulo t = new Triangulo(gera.nextInt(25), gera.nextInt(25));
        Triangulo t1 = new Triangulo();
        t.Area();t1.Area();
        
        
        Data d1 = new Data(2,9,2015);
        Data d2 = new Data();
        
        JOptionPane.showMessageDialog(null,d1.dia+"/"+d1.mes+"/"+d1.ano);
        JOptionPane.showMessageDialog(null,d2.dia+"/"+d2.mes+"/"+d2.ano);
        
        JOptionPane.showMessageDialog(null,"Entre com os dados da conta corrente:");
        n = JOptionPane.showInputDialog(null,"Entre com o nome:");
        d = JOptionPane.showInputDialog(null,"Entre com o saldo:");
        s = Float.parseFloat(d);
        d = JOptionPane.showInputDialog(null,"Entre com o limite:");
        l = Float.parseFloat(d);
        d = JOptionPane.showInputDialog(null,"Entre com o tipo de conta: \nJ - Jurídica    F-Física");

        
        
        
    }
}
