/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciosbeecrowd_13;

/**
 *
 * @author alifi
 */
public class ExerciciosBeecrowd_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double valor = 0;
        int notas[] = {0,0,0,0,0,0};
        int moedas[] = {0,0,0,0,0,0};
        
        while (true){
            if(valor > 2){
                if(valor > 100){
                    valor = valor - 100;
                    notas[0] =+ 1;
                }else if(valor > 50){
                    valor = valor - 50;
                    notas[1] =+1;
                }else if(valor > 20){
                    valor = valor - 20;
                    notas[2] =+1;
                }else if(valor > 10){
                    valor = valor - 10;
                    notas[3] =+1;
                }else if(valor > 5){
                    valor = valor - 5;
                    notas[4] =+1;
                }else if(valor > 2){
                    valor = valor - 2;
                    notas[5] =+1;
                }
            }else if (valor < 2 && valor > 0.01){
                if(valor > 1){
                    valor = valor - 1;
                    moedas[0] =+1;
                }else if(valor > 0.05){
                    valor = valor - 0.50;
                    moedas[1] =+1;
                }else if (valor > 0.25){
                    valor = valor - 0.25;
                    moedas[2] =+1;
                }else if(valor > 0.10){
                    valor = valor - 0.10;
                    moedas[3] =+1;
                }else if (valor > 0.05){
                    valor = valor - 0.05;
                    moedas[4] =+1;
                }else if (valor > 0.01){
                    valor = valor - 0.01;
                    moedas[5] =+1;
                }
            }else{
                break;
            }
        }
        
        
        
        
    }
    
}
