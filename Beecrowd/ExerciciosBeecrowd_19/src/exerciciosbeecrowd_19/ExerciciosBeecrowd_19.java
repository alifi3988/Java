/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciosbeecrowd_19;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author alifi
 */
public class ExerciciosBeecrowd_19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Scanner entrada = new Scanner(System.in);
        
        int v1 = entrada.nextInt();
        int v2 = entrada.nextInt();
        int v3 = entrada.nextInt();
        
        int vet1[] = {v1, v2, v3};
        
        Arrays.sort(vet1);
        
        for(int i: vet1){
            System.out.println(i);
        }
        System.out.println("\n" + v1);
        System.out.println(v2);
        System.out.println(v3);
        
    }
    
}
