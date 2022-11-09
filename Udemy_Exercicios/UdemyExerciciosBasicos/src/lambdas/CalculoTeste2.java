/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lambdas;

/**
 *
 * @author alifi
 */
public class CalculoTeste2 {

    public static void main(String[] args) {
        
        //utilizando a lambda
        //está puxando da classe Calculo a função e jogando para a variavel
        Calculo soma = (x,y) -> {return x+y;}; 
        
        System.out.println("Soma: " + soma.executar(2, 3));

    }
}
