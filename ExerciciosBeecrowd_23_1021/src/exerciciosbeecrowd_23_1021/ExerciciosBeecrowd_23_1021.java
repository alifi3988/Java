
package exerciciosbeecrowd_23_1021;

import java.util.Scanner;


public class ExerciciosBeecrowd_23_1021 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        //criação de vetores
        double vetM[] = {1.00, 0.50, 0.25, 0.10, 0.05, 0.01};
        double vetN[] = {100.00, 50.00, 20.00, 10.00, 5.00, 2.00};
        
        int qtdM[] = {0,0,0,0,0,0};
        int qtdN[] = {0,0,0,0,0,0};
        
        //entrada do valor
        double valor = entrada.nextDouble();
        
        while(true){
            if(valor >= 2.00){
                for(int i=0; i < 6; i++){
                    if(vetN[i] <= valor){
                        while(true){
                            if(valor < vetN[i]) break;
                            valor = valor - vetN[i];
                            qtdN[i] = qtdN[i]+1;
                        }
                    }
                }
            }else if(valor < 2.00 && valor > 0){
                for(int i=0; i < 6; i++){
                    if(vetM[i] <= valor){
                        while(true){
                            if(valor < vetM[i]) break;
                            valor = valor - vetM[i];
                            qtdM[i] = qtdM[i]+1;
                        }
                    }
                }
            }else{
                break;
            }
        }
        System.out.println(valor);
    }
}
