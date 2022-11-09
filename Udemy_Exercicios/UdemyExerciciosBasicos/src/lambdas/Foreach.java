/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lambdas;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author alifi
 */
public class Foreach {
    
    public static void main(String[] args) {
        
        List<String> aprovados = Arrays.asList("Ana", "Bia", "Lia", "Gui");
                
        System.out.println("Tradicional");
        for(String nome: aprovados){
            System.out.println(nome);
        }
        
        System.out.println("\nLambda #01");
        aprovados.forEach((nome) -> {System.out.println(nome);});
        
        System.out.println("\nLambda #02");
        aprovados.forEach(nome -> System.out.println(nome));
        
        System.out.println("\nMethod Reference");
        aprovados.forEach(System.out::println);
        
        
        
    }
    
}
