/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lambdas;

import java.util.function.Function;

/**
 *
 * @author alifi
 */
public class Funcao {
    public static void main(String[] args) {
        Function<Integer, String> parOuimpar = 
                numero -> numero % 2 == 0 ? "Par" : "Ímpar";
        
        System.out.println(parOuimpar.apply(0));
        
        Function<String, String> oResultado = 
                valor -> "O resultado é: " + valor;
        
        Function<String, String> empolgado =
                valor -> valor + "!!!";
        
        String resFnal = parOuimpar
                .andThen(oResultado)
                .andThen(empolgado)
                .apply(33);
               
        System.out.println(resFnal);
        
    }
    
}
