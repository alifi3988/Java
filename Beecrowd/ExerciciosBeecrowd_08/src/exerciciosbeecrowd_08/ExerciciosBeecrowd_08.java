/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciosbeecrowd_08;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author alifi
 */
public class ExerciciosBeecrowd_08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int codigo[] = new int[2];
        int numero[] = new int[2];
        double valor[] = new double[2];
        double soma = 0;
       
        Scanner entrada = new Scanner(System.in);
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US);
        DecimalFormat f = new DecimalFormat("00.00", symbols);
        
        for(int i = 0; i < 2; i++){
            codigo[i] = entrada.nextInt();
            numero[i] = entrada.nextInt();
            valor[i] = entrada.nextDouble();
            soma = soma + (valor[i] * numero[i]);
        }
        System.out.println("VALOR A PAGAR: R$ " + f.format(soma));
                
    }
    
}
