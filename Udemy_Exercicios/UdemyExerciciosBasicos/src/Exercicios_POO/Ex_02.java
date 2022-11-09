package Exercicios_POO;

import java.util.Scanner;

/*
Escreva um programa que leia o nome e salário atual de um funcionário. O programa deve calcular
seu novo salário (segundo a tabela abaixo) e mostrar o nome, o salário atual e o salário reajustado do
funcionário:
*/
public class Ex_02 {
    public static void main(String[] args) {
        
        String Funcionario[][][];
        String nome;
        double s_Atual;
        double soma_Atual = 0;
        double s_Novo;
        double soma_Novo = 0;
        int contador = 0;
        
        Scanner entrada = new Scanner(System.in);
        
        while(true){
            System.out.print("Informe o nome do Funcionário: ");
            nome = entrada.next();     
            System.out.println(nome.toUpperCase());
            if(nome.toUpperCase() == "FIM"){
                break;
            }

            System.out.print("Informe o salario Atual do funcionário: ");
            s_Atual = entrada.nextDouble();
            soma_Atual = soma_Atual + s_Atual;
            
            
            if(s_Atual <= 1600){
                s_Atual = s_Atual + (s_Atual * 0.25);
                soma_Novo = soma_Novo + s_Atual;
            }else if(s_Atual > 1600 && s_Atual <= 300){
                s_Atual = s_Atual + (s_Atual * 0.20);
                soma_Novo = soma_Novo + s_Atual;
            }else if(s_Atual > 3000 && s_Atual <=5000){
                s_Atual = s_Atual + (s_Atual * 0.15);
                soma_Novo = soma_Novo + s_Atual;
            }else if(s_Atual > 5000 && s_Atual <=6000){
                s_Atual = s_Atual + (s_Atual * 0.10);
                soma_Novo = soma_Novo + s_Atual;
            }
        }
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*--*-*-*-*-*-*-*-*-*-*--*-*-*-*-*-*-");
        System.out.println("* * *  RESULTADO * * *");
        System.out.println("Soma dos salários Atuais: R$ " + soma_Atual);
        System.out.println("Soma dos salários reajustados: R$ " + soma_Novo);
        System.out.println("Diferença entre os salários: R$ " + (soma_Novo - soma_Atual));
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*--*-*-*-*-*-*-*-*-*-*--*-*-*-*-*-*-");
        
        
    }
    
}
