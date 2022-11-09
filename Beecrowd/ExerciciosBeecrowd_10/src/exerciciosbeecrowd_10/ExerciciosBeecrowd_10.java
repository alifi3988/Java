/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciosbeecrowd_10;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author alifi
 */
public class ExerciciosBeecrowd_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner e = new Scanner(System.in);
        DecimalFormatSymbols s = new DecimalFormatSymbols(Locale.US);
        DecimalFormat f = new DecimalFormat("0.000", s);
        
        double a = e.nextDouble();
        double b = e.nextDouble();
        double c = e.nextDouble();
        System.out.println("TRIANGULO: " + f.format(((a * c)/2)));
        System.out.println("CIRCULO: " + f.format(3.14159 * (c*c)));
        System.out.println("TRAPEZIO: " + f.format(((a + b)*c)/2));
        System.out.println("QUADRDO: " + f.format(b * b));
        System.out.println("RETNGULO: " + f.format(a*b));
      
    }
    
}
