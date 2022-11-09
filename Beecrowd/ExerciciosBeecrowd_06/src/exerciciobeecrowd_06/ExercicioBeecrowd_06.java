/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciobeecrowd_06;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author alifi
 */
public class ExercicioBeecrowd_06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero, horas;
        double valor, salario;
        
        Scanner entrada = new Scanner(System.in);
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US);
        DecimalFormat f = new DecimalFormat("0.00", symbols);
        
        numero = entrada.nextInt();
        horas = entrada.nextInt();
        valor = entrada.nextDouble();
        
        salario = (valor * horas);
        
        System.out.println("NUMBER = " + numero);
        System.out.println("SALARY = U$ " + f.format(salario));

        
    }
    
}
