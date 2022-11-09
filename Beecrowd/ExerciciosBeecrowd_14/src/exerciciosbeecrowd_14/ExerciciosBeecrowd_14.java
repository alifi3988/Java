/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciosbeecrowd_14;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author alifi
 */
public class ExerciciosBeecrowd_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double notas[] = {100, 50, 20, 10, 5, 2};
        double moedas[] = {1, 0.50, 0.25, 0.10, 0.05, 0.01};
        int cont[] = {0,0,0,0,0,0,0,0,0,0,0,0}, i = 0;
        double valor, en = 0;
        DecimalFormatSymbols s = new DecimalFormatSymbols(Locale.US);
        DecimalFormat f = new DecimalFormat("0.00", s);
        
        Scanner e = new Scanner(System.in);
        valor = e.nextDouble();
        
        while (true){
            if(en + notas[i] <= valor){
                en=+notas[i];
                cont[i]++;
            }else if (en + moedas[i] <= valor){
                en=+moedas[i];
                cont[i]++;
            }else{
                i++;
            }
            
            if(en == valor){
                break;
            }
        }
        System.out.println(en);
        
    }
}   
