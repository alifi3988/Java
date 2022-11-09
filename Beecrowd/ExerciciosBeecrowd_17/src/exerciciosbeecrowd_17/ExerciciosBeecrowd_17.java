/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciosbeecrowd_17;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author alifi
 */
public class ExerciciosBeecrowd_17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double n1, n2, n3, n4;
        String resultado = "";
        
        Scanner entrada = new Scanner(System.in);         
        
        DecimalFormatSymbols symb = new DecimalFormatSymbols(Locale.US);
        DecimalFormat formatar = new DecimalFormat("0.0", symb);
        

        
        //recebendo os valores e calculando com o seu peso
        n1 = entrada.nextDouble();
        n1 = n1 * 2;
        n2 = entrada.nextDouble();
        n2 = n2 * 3;
        n3 = entrada.nextDouble();
        n3 = n3 * 4;
        n4 = entrada.nextDouble();
        n4 = n4 * 1;
        
        double media = (n1 + n2 + n3 + n4) / 10;
        
        resultado = resultado + ("Media: " + formatar.format(media));
        if(media >= 7){
            resultado = resultado + ("\nAluno aprovado.");
        }else if(media < 5){
            resultado = resultado + ("\nAluno reprovado.");
        }else{
            resultado = resultado + ("\nAluno em exame.");
            double exame = entrada.nextDouble();
            resultado = resultado+ ("\nNota do exame: " + formatar.format(exame));
            media = (media + exame) / 2;
            if(media > 5) resultado = resultado + ("\nAluno aprovado.");
            else resultado = resultado + ("\nAluno reprovado.");
            resultado = resultado + ("\nMedia final: " + formatar.format(media));
            
        }
        System.out.println("" + resultado);
    }
    
}
