/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula5c;

/**
 *
 * @author dti
 */
public class Triangulo extends Forma{
    private float base;
    private float altura;
    

    public Triangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
   
    
    @Override
    public float area(){
        return (base*altura)/2;
    }
    @Override
    public float perimetro(){
        return base*3;
    }
    
    @Override
    public void mostra(){
        System.out.println("Triangulo:\nArea: "+area()+"\nPerimetro: "+perimetro());
    }

}
