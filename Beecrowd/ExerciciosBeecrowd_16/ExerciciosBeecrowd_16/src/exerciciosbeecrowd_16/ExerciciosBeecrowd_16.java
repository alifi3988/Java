/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciosbeecrowd_16;

    import java.text.DecimalFormat;
    import java.text.DecimalFormatSymbols;
    import java.util.*;

/**
 *
 * @author alifi
 */
public class ExerciciosBeecrowd_16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double notas[] = {100.00, 50.00, 20.00, 10.00, 5.00, 2.00, 1.00, 0.50, 0.25, 0.10, 0.05, 0.01};
        int qtd[] = new int[12];
        
        DecimalFormatSymbols s = new DecimalFormatSymbols(Locale.US);
        DecimalFormat f = new DecimalFormat("0.00", s);
        DecimalFormat form = new DecimalFormat();

        
        Scanner e = new Scanner(System.in);
        
        System.out.println("Informe o valor: ");
        double valor = e.nextDouble();
        
        System.out.println(valor);
        
        
        while(true){
            
            System.out.println("Valor: " + valor);
            if(valor > 1.00){
                System.out.println("Primeiro if");
                if(valor >= 100.00){
                    valor -=100.00;
                    qtd[0]++;
                }else if(valor < 100 && valor > 50){
                    valor -=50.00;
                    qtd[1]++;
                }else if(valor < 50.0 && valor > 20.0){
                    valor -=20.00;
                    qtd[2]++;
                }else if(valor < 20 && valor > 10){
                    valor -=10.00;
                    qtd[3]++;
                }else if(valor < 10 && valor > 5){
                    valor -=5.00;
                    qtd[4]++;
                }else if(valor < 5 && valor > 2){
                    valor -=2.00;
                    qtd[5]++;
                }
                //moedas
              
            }else if(valor < 1.00 && valor > 0){
                System.out.println("Segundo if");
                if(valor < 2 && valor > 1){
                    valor -=1.00;
                    qtd[6]++;
                }else if(valor < 1 && valor > 0.50){
                    valor -=0.50;
                    qtd[7]++;
                }else if(valor < 0.50 && valor > 0.25){
                    valor -=0.25;
                    qtd[8]++;
                }else if(valor < 0.25 && valor > 0.10){
                    valor -=0.10;
                    qtd[9]++;
                }else if(valor < 0.10 && valor > 0.05){
                    valor -=0.05;
                    qtd[10]++;
                }else if(valor < 0.05 && valor > 0.01){
                    valor -=0.01;
                    qtd[11]++;
                }
                
            }else if(valor == 0.0){
                break;
            }
        } //fim while
        
        for(int i = 0; i < 12; i++){
            if(i < 6){
                if(i == 0){
                    System.out.println("NOTAS:");
                }
                System.out.println(qtd[i] + " nota(s) de R$ " + f.format(notas[i]));
            }else{
                if(i == 6){
                    System.out.println("MOEDAS:");
                }
                System.out.println(qtd[i] + " moeda(s) de R$ " + f.format(notas[i]));
                
            }
        }
    }
    
}
