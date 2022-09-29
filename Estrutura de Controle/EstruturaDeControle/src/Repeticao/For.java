
package Repeticao;

import java.util.Scanner;


public class For {
    
    public static void main(String[] args) {
       
        
        //Criação de uma tabuada simples, para mostrar a estrutura
        int numero;
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Informe um número para mostrar a tabuada: ");
        numero = entrada.nextInt();
        
        for(int i = 0; i < numero; i++){
            System.out.printf("%d x %d = %d \n", i,numero,(i*numero));
        }
    }
}
