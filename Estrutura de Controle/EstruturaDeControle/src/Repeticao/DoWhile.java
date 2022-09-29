/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repeticao;

import java.util.Scanner;

/**
 *
 * @author alifi
 */
public class DoWhile {

    public static void main(String[] args) {
        
        //usa o while normalmente quando não sabe o final
        //nas aulas de C++ utilizava muito para fazer menus...
        
        Scanner entrada = new Scanner(System.in);
        
        int valor = 0;
        
        //repetir, enquanto o valor passado for verdadeiro
        
        //verificando se é par ou impar
        do{
            System.out.println("Digite valores negativos, se deseja parar!");

            System.out.print("Informe um valor: ");
            valor = entrada.nextInt();
            if(valor >= 0){
                if(valor%2 == 0){
                    System.out.println(valor + " é par!");
                }else{
                    System.out.println(valor + " é ímpar!");
                }
                System.out.println();
            }
        }while(valor >= 0);
        //a diferença é que faz a verificação depois de entrar dentro da estrutura
        //ou seja, a condição pode ser executada, mesmo que for falso
    }
}
