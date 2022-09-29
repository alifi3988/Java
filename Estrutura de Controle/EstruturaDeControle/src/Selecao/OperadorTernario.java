package Selecao;

import java.util.Scanner;


public class OperadorTernario {
    
    public static void main(String[] args) {
        
        int dias;
        
        Scanner entrada = new Scanner(System.in);
        
        dias = entrada.nextInt();
        
        System.out.println((dias <=15) ? "Primeira Quinzena" : "Segunda Quinzena");
        
    }
}
