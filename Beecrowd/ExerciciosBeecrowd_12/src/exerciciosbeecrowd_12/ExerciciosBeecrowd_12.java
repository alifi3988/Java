/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciosbeecrowd_12;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author alifi
 */
public class ExerciciosBeecrowd_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x;
        double y;
        double t;
        
        Scanner e = new Scanner(System.in);
        DecimalFormatSymbols s = new DecimalFormatSymbols(Locale.US);
        DecimalFormat f = new DecimalFormat("0.000", s);
        x = e.nextInt();
        y = e.nextDouble();
        
        t = (x/y);
        
        System.out.println(f.format(t) + " km/l");      
    }
    
}
