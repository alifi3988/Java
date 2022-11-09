
package exerciciosbeecrowd_16;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

public class ExerciciosBeecrowd_16 {

    public static void main(String[] args) {
        
        double notas[] = {100.00, 50.00, 20.00, 10.00, 5.00, 2.00};
        int contNotas[] = new int[6];
        double moedas[] = {1.00, 0.50, 0.25, 0.10, 0.05, 0.01};
        int contMoedas[] = new int[6];
        DecimalFormatSymbols forSymb = new DecimalFormatSymbols(Locale.US);
        DecimalFormat f = new DecimalFormat("0.00", forSymb);
        f.setRoundingMode(RoundingMode.DOWN);

        
        Scanner entrada = new Scanner(System.in);
        
        double valor = entrada.nextDouble();
        
        while(true){
            valor = Double.parseDouble(f.format(valor));
            if(valor >= 2){
                for(int i = 0; valor != 0; i++){
                    if(valor < 2) break;
                    while(true){
                        valor = Double.parseDouble(f.format(valor));
                        if(valor - notas[i] >= 0.00){
                            valor = valor-notas[i];
                            valor = Double.parseDouble(f.format(valor));
                            contNotas[i]++;
                        }else break;
                        valor = Double.parseDouble(f.format(valor));
                    }
                }
            }else if(valor < 2 && valor > 0){
                for(int i = 0; valor != 0; i++){
                    if(valor <=0) break;
                    while(true){
                        valor = Double.parseDouble(f.format(valor));
                        if(valor - moedas[i] >= 0.00){
                            valor = valor - moedas[i];
                            valor = Double.parseDouble(f.format(valor));
                            contMoedas[i]++;
                        }else break;
                        valor = Double.parseDouble(f.format(valor));
                    }
                }
            }else if(valor == 0) break;
            valor = Double.parseDouble(f.format(valor));
        }
        
        System.out.println("NOTAS:");
        for(int i = 0; i < 6; i++){
            System.out.printf(contNotas[i] + " nota(s) de R$ " + f.format(notas[i]) + "\n");
        }
        System.out.println("MOEDAS:");
        for(int i = 0; i< 6; i++){
            System.out.printf(contMoedas[i] + " moeda(s) de R$ " + f.format(moedas[i]) + "\n");
        }
    }
}
