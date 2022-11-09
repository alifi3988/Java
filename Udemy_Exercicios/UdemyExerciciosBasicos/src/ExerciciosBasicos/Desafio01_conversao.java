/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExerciciosBasicos;

import java.util.*;

/**
 *
 * @author alifi
 */
public class Desafio01_conversao {
    public static void main(String[] args){
        String s1,s2,s3;
        double a,b,c, media;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Informe os 3 ultimos salários...");
        System.out.print("Salário 01: R$ ");
        s1 = entrada.nextLine();
        System.out.print("Salário 02: R$ ");
        s2 = entrada.nextLine();
        System.out.print("Salário 03: R$ ");
        s3 = entrada.nextLine();
        System.out.println("---------------------------------");
        //conversão dos valores
        a = Double.parseDouble(s1.replace(",", "."));
        b = Double.parseDouble(s2.replace(",", "."));
        c = Double.parseDouble(s3.replace(",", "."));
        //finalização da conversão
        
        //realizando a média dos valores
        media = (a + b + c) / 3;
        
        System.out.printf("A média do salário é: R$ %.2f", media);
        
    }
    
}
