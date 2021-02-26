/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Bryan
 */
public class Investimento {
    
    protected double valorInicial;
    protected double jurosMensais;

    public Investimento(double valorInicial, double jurosMensais) {
        this.valorInicial = valorInicial;
        this.jurosMensais = jurosMensais / 100;
    }
    
    public double calcularLucro(int meses){
        double lucro = Math.pow((1 + jurosMensais), meses);
        lucro *= valorInicial;
        lucro -= valorInicial;
        return lucro;
    }
    
}
