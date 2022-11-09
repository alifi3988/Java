/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciosbeecrowd_02;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author alifi
 */
public class ExerciciosBeecrowd_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
         
         double area, f;
         
         Scanner entrada = new Scanner(System.in);
         DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US); //Importando  classe para classificar o padrão que deseja, no cso USA
         DecimalFormat formatacao = new DecimalFormat("0.0000", symbols); // Instanciando para puxar a formatação
         
        f = entrada.nextDouble();
     
        area = 3.14159 * (f * f);

        //System.out.printf("A=%.4f",area);
        System.out.printf("A=" + formatacao.format(area) + "\n"); 

        }
    }