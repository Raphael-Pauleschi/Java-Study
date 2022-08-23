/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula5b;

/**
 *
 * @author dti
 */
public class testaClasse {
    public static void main(String[] args){
        Eletronico e = new Eletronico(1234,"Calcula números",2000,20);
        Calcado c = new Calcado("sola","algo","material","Sapato","Rosa","42",1654,"É um sapato",290);
        Roupa r = new Roupa("algodão","camisa","cinza","GG",9867,"É uma camisa",330);
    
        e.print(); 
        c.print(); 
        r.print();
        
    }  
 
}
