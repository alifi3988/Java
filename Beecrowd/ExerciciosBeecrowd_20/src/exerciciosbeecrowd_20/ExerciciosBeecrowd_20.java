/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciosbeecrowd_20;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author alifi
 */
public class ExerciciosBeecrowd_20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        boolean triangulo = false;
        
        DecimalFormatSymbols s = new DecimalFormatSymbols(Locale.US);
        DecimalFormat formt = new DecimalFormat("0.0", s);
        
        
        double a = entrada.nextDouble();
        double b = entrada.nextDouble();
        double c = entrada.nextDouble();
        
        //verificando se forma um triangulo
        if(a + b > c)
            if(a + c > b)
                if(b + c > a){
                    System.out.println("Perimetro = " + formt.format((a + b + c)));
                    triangulo = true;
                }
        
        if(triangulo == false){
            System.out.println("Area = " + formt.format(((a + b) * c) / 2));
        }
    }
}
