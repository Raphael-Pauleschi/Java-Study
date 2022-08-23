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
public class Crescente {
    int n1,n2,n3;
    
    Crescente(){
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Entre com valor 1:"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Entre com valor 2:"));
        n3 = Integer.parseInt(JOptionPane.showInputDialog("Entre com valor 3:"));
    }
    void escrita(){
        if (n1 > n2 && n1 > n3){
            if(n2 > n3)
                JOptionPane.showMessageDialog(null,"Em ordem Crescente: "+
                        "\n"+n1+"\n"+n2+"\n"+n3);
            else  
                JOptionPane.showMessageDialog(null,"Em ordem Crescente: "+
                        "\n"+n1+"\n"+n3+"\n"+n2);
        }
        if (n2 > n1 && n2 > n3){
           if(n1 > n3)
               JOptionPane.showMessageDialog(null,"Em ordem Crescente: "+
                        "\n"+n2+"\n"+n1+"\n"+n3);
            else  
               JOptionPane.showMessageDialog(null,"Em ordem Crescente: "+
                        "\n"+n2+"\n"+n3+"\n"+n1);
        }
        if (n3 > n1 && n3 > n2){
           if(n2 > n1)
               JOptionPane.showMessageDialog(null,"Em ordem Crescente: "+
                        "\n"+n3+"\n"+n2+"\n"+n1);
            else  
               JOptionPane.showMessageDialog(null,"Em ordem Crescente: "+
                        "\n"+n3+"\n"+n1+"\n"+n2);
        }        
    }
    
}
