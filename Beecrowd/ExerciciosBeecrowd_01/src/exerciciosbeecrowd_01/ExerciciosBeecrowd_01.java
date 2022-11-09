/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciosbeecrowd_01;

import java.util.Scanner;

/**
 *
 * @author alifi
 */
public class ExerciciosBeecrowd_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int a, b;
         
         Scanner teclado = new Scanner(System.in);
         System.out.println("Informe o primeiro numero: ");
         a = teclado.nextInt(); 
         System.out.println("Informe o segundo numero: ");
         b = teclado.nextInt();
         
         System.out.println("X = " + (a + b));
         
    }
 
}