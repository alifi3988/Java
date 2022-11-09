/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciosbeecrowd_15;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author alifi
 */
public class ExerciciosBeecrowd_15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double a, b, c, d, media, exame = 0;
        
        Scanner e = new Scanner(System.in);
        DecimalFormatSymbols s = new DecimalFormatSymbols(Locale.US);
        DecimalFormat f = new DecimalFormat("0.0", s);
        
        a = e.nextDouble();
        b = e.nextDouble();
        c = e.nextDouble();
        d = e.nextDouble();
        
        media = (a * 2.0 + b*3.0 + c*4.0 + d *1.0)/10;
        
        if(media > 5 && media < 7){
            exame = e.nextDouble();
        }
        if(media >7){
            System.out.println("Media: " + f.format(media));
            System.out.println("Aluno aprovado.");
        }else if(media < 5){
            System.out.println("Media: " + f.format(media));
            System.out.println("Aluno reprovado.");               
        }else{
            System.out.println("Media: " + f.format(media));
            System.out.println("Aluno em exame.");
            System.out.println("Nota do exame: " + f.format(exame));
            media = (media + exame)/2;
            if(media < 5){
                System.out.println("Aluno reprovado.");
            }else{
                System.out.println("Aluno aprovado.");
            }
            System.out.println("Media final: " + f.format(media));
            
        }
        
    }
    
}
