/***
 Escreva um programa que carregue dois valores A e B pelo teclado e imprima todos os números
ímpares entre A e B.
 ***/
package Exercicios_POO;

import java.util.Scanner;

/**
 *
 * @author alifi
 */
public class Ex_01 {
    
    public static void main(String[] args) {
        
        int A = 0, B = 0;
        String impares = "";
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Informe o primeiro valor: ");
        A = entrada.nextInt();
        
        System.out.print("Informe o segundo valor: ");
        B = entrada.nextInt();
        
        if(A < B){
            for(int i = A; i < B; i++){
                    
                if(i%2 != 0){
                    impares = impares + i + "  ";
                }
            }
        }else{
            for(int i = B; i < A; i++){
                if(i%2 != 0){
                    impares = impares + i + "  ";
                }
            }
        }
        
        System.out.println("Sequência-> " + impares);       
    }
    
}
