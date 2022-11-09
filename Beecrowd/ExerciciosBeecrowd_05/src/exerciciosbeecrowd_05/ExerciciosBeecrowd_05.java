/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciosbeecrowd_05;

import java.util.Scanner;

/**
 *
 * @author alifi
 */
public class ExerciciosBeecrowd_05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int A,B,C,D, DIFERENCA;
        int vetor[] = new int[100];
        Scanner entrada = new Scanner(System.in);
        
        A = entrada.nextInt();
        B = entrada.nextInt();
        C = entrada.nextInt();
        D = entrada.nextInt();
        
        DIFERENCA = (A * B - C * D);
        
        System.out.println("DIFERENCA = " + DIFERENCA);
    }
    
}
