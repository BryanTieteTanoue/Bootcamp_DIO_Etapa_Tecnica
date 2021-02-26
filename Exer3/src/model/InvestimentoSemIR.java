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
public class InvestimentoSemIR extends Investimento{
    
    public InvestimentoSemIR(double valorInicial, double jurosMensais) {
        super(valorInicial, jurosMensais);
    }
    
    @Override
    public double calcularLucro(int meses){
        double lucro;
        if (this.valorInicial < 1000){
            lucro = 0;
            System.out.println("O valor inicial não pode ser 0");
        } else{
            lucro = super.calcularLucro(meses); //reutilizando o método da classe mãe
        }
        return lucro;
    }
    
}
