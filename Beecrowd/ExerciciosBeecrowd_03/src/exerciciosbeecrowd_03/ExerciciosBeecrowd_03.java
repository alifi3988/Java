/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciosbeecrowd_03;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author alifi
 */
public class ExerciciosBeecrowd_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double a, b, media;
        
        Scanner entrada = new Scanner(System.in);
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US);
        DecimalFormat formatacao = new DecimalFormat("0.00000", symbols);
        
        a = entrada.nextDouble();
        b = entrada.nextDouble();
        
        media = (a * 3.5 + b * 7.5) / 11;
        
        System.out.printf("MEDIA = " + formatacao.format(media) + "\n");
    }
    
}
