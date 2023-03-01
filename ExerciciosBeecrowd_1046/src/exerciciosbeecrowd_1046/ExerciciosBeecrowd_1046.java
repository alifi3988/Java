/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciosbeecrowd_1046;

import java.util.Scanner;

/**
 *
 * @author alifi
 */
public class ExerciciosBeecrowd_1046 {

    public static void main(String[] args) {
        
        //entrada de dados
        Scanner entrada = new Scanner(System.in);
        
        //declaração de variaveis e entrada dos dados
        
        int horas = 0;
        
        System.out.print("informe a hora inicial: ");
        int inicio = entrada.nextInt();
        
        System.out.print("informe a hora final: ");
        int fim = entrada.nextInt();
        
        if((inicio + 1) == fim){
            horas = 1;
        }else{        
            int i = inicio;
            do{
                horas = horas + 1;
                i++;
                if(i == 24) i = 0;
            }while(i != fim);
        }
        
        System.out.println("O JOGO DUROU " + horas + " HORA(S)");
    }
    
}
