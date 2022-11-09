/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex_01;

import java.util.Scanner;

/**
 *
 * @author alifi
 */
public class Ex_array {
    public static void main(String[] args) {
        int qtd;
        double soma = 0, media = 0;
        
        Scanner e = new Scanner(System.in);
        
        System.out.print("Informe o número de notas: ");
        qtd = e.nextInt();
        
        double[] notas = new double[qtd];
        
        for(int i = 0; i < qtd; i++){
            System.out.print("Informe a " + (i+1) + "ª nota: ");
            notas[i] = e.nextDouble();
        }
        
        System.out.println("===================================");
        
        for(double nota: notas){
            soma +=nota;
        }
        media = soma / qtd;
        
        System.out.println("A média é: " + media);
                
    }
            
    
}
