/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula5;
import javax.swing.JOptionPane;
/**
 *
 * @author dti
 */
public class Vendedor {
    private float vendas, salario;
    private String nome;
    private int falta;

    public Vendedor(float vendas, float salario, String nome, int falta) {
        this.vendas = vendas;
        this.salario = salario;
        this.nome = nome;
        this.falta = falta;
    }
    public float getVendas() {
        return vendas;
    }
    public void setVendas(float vendas) {
        this.vendas = vendas;
    }
    public float getSalario() {
        return salario;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getFalta() {
        return falta;
    }
    public void setFalta(int falta) {
        this.falta = falta;
    }
    public void imprimirDados(){
        JOptionPane.showMessageDialog(null, "Dados do usuário: "+
                "\nNome: "+nome+"\nVendas: R$"+vendas+
                "\nSalário: R$"+salario+"\nFaltas: "+falta);
    }
    public float calcularComissao(){
        if (vendas >= 2000)
            return vendas*15/100;
        else if (vendas >= 1000)
            return vendas*10/100;
        else
            return 0;
    }
    public float descontoFalta(){
        return (salario/30)*falta;
    }
    public void calcularSalario(){
        salario = salario + calcularComissao() - descontoFalta();
    }
    
    
    
}
