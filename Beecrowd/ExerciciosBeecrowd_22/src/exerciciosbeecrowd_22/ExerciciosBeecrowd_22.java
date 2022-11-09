/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciosbeecrowd_22;

import java.util.Scanner;

/**
 *
 * @author alifi
 */
public class ExerciciosBeecrowd_22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //importação para entrada de dados
        Scanner entrada = new Scanner(System.in);
        
        //declaração das variaveis
        double A = 0, B = 0, C = 0;
        double v1, v2, v3;
        String triangulo = "";
        
        //entrada de dados        
        v1 = entrada.nextDouble();
        v2 = entrada.nextDouble();
        v3 = entrada.nextDouble();
        
        //ordenando em ordem decrescence, de modo que o A seja o maior
        if(v1 > v2 && v1 > v3){
            A = v1;
            if(v2 > v3){
                B = v2;
                C = v3;
            }else if(v3 > v2){
                B = v3;
                C = v2;
            }else{
                B = v2;
                C = v3;
            }
        }
        else if(v2 > v1 && v2 > v3){
            A = v2;
            if(v1 > v3){
                B = v1;
                C = v3;
            }else if(v3 > v1){
                B = v3;
                C = v1;
            }else{
                B = v1;
                C = v3;
            }
        }
        else if(v3 > v2 && v3 > v1){
            A = v3;
            if(v2 > v1){
                B = v2;
                C = v1;
            }else if(v1 > v2){
                B = v1;
                C = v2;
            }else{
                B = v1;
                C = v2;
            }
        }else{
            A = v1;
            B = v2;
            C = v3;
        }
        
        //estrutura de seleção       
        ///VALIDAÇÕES
        if(A >= (B+C)) triangulo = triangulo + ("\nNAO FORMA TRIANGULO");
        else{
            if((A * A) == ((B * B) + (C * C))) triangulo = triangulo + ("\nTRIANGULO RETANGULO");
            if((A * A) > ((B * B) + (C * C))) triangulo = triangulo + ("\nTRIANGULO OBTUSANGULO");
            if((A * A) < ((B * B) + (C * C))) triangulo = triangulo + ("\nTRIANGULO ACUTANGULO");
            if(A == B && A == C ) triangulo = triangulo + ("\nTRIANGULO EQUILATERO");
            if(A == B && B!= C) triangulo = triangulo + ("\nTRIANGULO ISOSCELES");
            if(A == C && C != B) triangulo = triangulo + ("\nTRIANGULO ISOSCELES");
            if(B == C && C != A) triangulo = triangulo + ("\nTRIANGULO ISOSCELES");
        }
        System.out.println(triangulo.trim());
        entrada.close();
    }
}
