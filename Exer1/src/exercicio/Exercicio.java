/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Bryan
 */
public class Exercicio {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double somatoria = 0;
        
        try{
            while(somatoria < 300){
                System.out.print("Digite um número: ");
                double num = sc.nextDouble();//ler double evita erro ao digitar "números quebrados"
                if(num < 0){
                    System.out.println("Números negativos não são permitidos");
                } else {
                    somatoria += num;
                }
            } 
            System.out.printf("O somatório foi: %.2f", somatoria);
        
        }catch(InputMismatchException e) {
            System.out.println("Não digite letras");
        }

    }
    
}
