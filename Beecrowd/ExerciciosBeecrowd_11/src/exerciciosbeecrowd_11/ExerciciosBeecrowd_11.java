/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciosbeecrowd_11;

import java.util.Scanner;

/**
 *
 * @author alifi
 */
public class ExerciciosBeecrowd_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner e = new Scanner(System.in);
        int maior;
        int a = e.nextInt();
        int b = e.nextInt();
        int c = e.nextInt();
        
        maior = a;
        
        if(b > a && c < b){
            maior = b;
        }else if(c > a && b < c){
            maior = c;
        }
        
        System.out.println(maior + " eh o maior");       
    }
}
