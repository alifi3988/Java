/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciosbeecrowd_07;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author alifi
 */
public class ExerciciosBeecrowd_07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String nome;
        double salario, vendas, total;
        
        Scanner e = new Scanner(System.in);
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US);
        DecimalFormat f = new DecimalFormat("0.00", symbols);
        
        nome = e.next();
        salario = e.nextDouble();
        vendas = e.nextDouble();
        
        total = ((vendas * 15)/100) + salario;
        
        System.out.println("TOTAL = R$ " + f.format(total));
        
    }
    
}
