/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula5c;

/**
 *
 * @author dti
 */
public class Quadrado extends Forma {
    private float base;

    public Quadrado(float base) {
        this.base = base;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }
    
    @Override
    public float area(){
        return base*base;
    }
    @Override
    public float perimetro(){
        return base*4;
    }
    
    @Override
    public void mostra(){
        System.out.println("Quadrado:\nArea: "+area()+"\nPerimetro: "+perimetro());
    }

}
