/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula2b;
import javax.swing.JOptionPane;
import java.util.Scanner;
/**
 *
 * @author raphael_ferraiolo
 */
public class Triangulo {
    Scanner input = new Scanner(System.in);
    float base;
    float altura;
    String valor;
    
    Triangulo(){
         valor = JOptionPane.showInputDialog("Digite a base:");
         base = Integer.parseInt(valor);
         valor = JOptionPane.showInputDialog("Digite a altura:");
         altura = Integer.parseInt(valor);
        
    }
    
    Triangulo(float a, float b){
        base = b;
        altura = a;
        JOptionPane.showMessageDialog(null, "Triângulo gerado, base "+base+" e altura "+altura);
    }
    
    public void Area(){
        float area = base*altura/2;
        JOptionPane.showMessageDialog(null,"Área: "+area);
    }
}
