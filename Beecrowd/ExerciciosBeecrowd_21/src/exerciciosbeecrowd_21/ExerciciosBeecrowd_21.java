
package exerciciosbeecrowd_21;

import java.util.Scanner;


public class ExerciciosBeecrowd_21 {

    public static void main(String[] args) {
        
        String verif = "Nao sao Multiplos";
        Scanner entrada = new Scanner(System.in);
        
        int a = entrada.nextInt();
        int b = entrada.nextInt();
        
        if(a >= b){
            if(a % b == 0){
                verif = "Sao Multiplos";
            }
        }else if(a <= b){
            if(b % a == 0){
                verif = "Sao Multiplos";
            }
        }
        System.out.println(verif);
    }
    
}
