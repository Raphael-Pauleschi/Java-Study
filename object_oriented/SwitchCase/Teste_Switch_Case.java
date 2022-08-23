/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula4b;
import java.util.Scanner;

/**
 *
 * @author dti
 */
public class Teste_Switch_Case {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Entre com um número entre 1 e 4:");
        int num= input.nextInt();
        switch(num){
            case 1:
                System.out.println("Você escolheu 1");
            break;
            case 2:
                System.out.println("Você escolheu 2");
            break;
            case 3:
                System.out.println("Você escolheu 3");
            break;
            case 4:
                System.out.println("Você escolheu 4");
            break;
            default:
                System.out.println("Número inválido");
        }
    }
}
