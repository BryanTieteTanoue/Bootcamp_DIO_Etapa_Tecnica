/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.InputMismatchException;
import java.util.Scanner;
import model.InvestimentoComIR;
import model.InvestimentoSemIR;

/**
 *
 * @author Bryan
 */
public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double valorInicial;
        
       try{
            System.out.print("Digite o valor inicial: ");
            valorInicial = sc.nextDouble();

            InvestimentoComIR investComIR = new InvestimentoComIR(valorInicial, 0.35);
            InvestimentoSemIR investSemIR = new InvestimentoSemIR(valorInicial, 0.3);

            for(int i = 0; i < 36; i++){
                System.out.printf("Mês: " + (i + 1) + //i +1 para dar o número certo
                        " | Investimento sem IR: R$ %.2f" +
                        " | Investimento com IR: R$ %.2f %n"
                        , investSemIR.calcularLucro(i+1)
                        , investComIR.calcularLucro(i+1));
            }

        } catch(InputMismatchException e){
            System.out.println("Não digite letras");
        }
    }
    
}
