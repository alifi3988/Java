package exerciciosbeecrowd_18;

import java.util.Scanner;

public class ExerciciosBeecrowd_18 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        String resultado = "";
        
        double v1 = entrada.nextDouble();
        double v2 = entrada.nextDouble();
        
        if(v1 == 0 && v2 == 0) resultado = "Origem";
        else if(v1 == 0.0 && v2 > 0.0) resultado = "Eixo Y";
        else if(v1 > 0.0 && v2 == 0.0) resultado = "Eixo X";
        else if(v1 == 0.0 && v2 < 0.0) resultado = "Eixo Y";
        else if(v1 < 0.0 && v2 == 0.0) resultado = "Eixo X";
        else if (v1 > 0.0 && v2 > 0.0) resultado = "Q1";
        else if (v1 > 0.0 && v2 < 0.0) resultado = "Q4";
        else if (v1 < 0.0 && v2 > 0.0) resultado = "Q2";
        else if(v1 < 0.0 && v2 < 0.0) resultado = "Q3";

        System.out.println(resultado);
    }
}