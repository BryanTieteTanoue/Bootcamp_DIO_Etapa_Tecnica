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
public class InvestimentoComIR extends Investimento{
    
    public InvestimentoComIR(double valorInicial, double jurosMensais) {
        super(valorInicial, jurosMensais);
    }
    
    @Override
    public double calcularLucro(int meses){
        double lucro = super.calcularLucro(meses); //reutilizando o método da classe mãe
        if (meses < 6){
            lucro = lucro - (lucro * 0.225);
        } else if(meses < 12){
            lucro = lucro - (lucro * 0.2);
        } else if(meses < 24){
            lucro = lucro - (lucro * 0.175);
        } else{
            lucro = lucro - (lucro * 0.15);
        }
        return lucro;
    }
    
}
