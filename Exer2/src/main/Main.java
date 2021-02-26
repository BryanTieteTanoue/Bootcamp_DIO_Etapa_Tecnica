/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import model.InvestimentoComIR;
import model.InvestimentoSemIR;

/**
 *
 * @author Bryan
 */
public class Main {
    
    public static void main(String[] args) {
        System.out.println("Investimentos      Valor inicial    Juros Mensais   Meses");
        System.out.println("InvestimentoComIR: R$ 5000,00       1,2%            17");
        System.out.println("InvestimentoSemIR: R$ 3000,00       0,7%            10");
        
        InvestimentoComIR investComIR = new InvestimentoComIR(5000, 1.2);
        InvestimentoSemIR investSemIR = new InvestimentoSemIR(3000, 0.7);
        double lucroComIR = investComIR.calcularLucro(17);
        double lucroSomIR = investSemIR.calcularLucro(17);
        
        
        System.out.printf("Investimento com juros: R$ %.2f %n", lucroComIR);
        System.out.printf("Investimento sem juros: R$ %.2f %n", lucroSomIR);
    }
    
}
