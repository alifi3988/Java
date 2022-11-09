/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

/**
 *
 * @author alifi
 */
public class Map {
    public static void main(String[] args) {
        
        Consumer<String> print = System.out::println;
        
        List<String> marcas = Arrays.asList("BMW", "Audi", "Honda");    
        marcas.stream().map(m -> m.toLowerCase()).forEach(print);
        
        //expressões lámbidas
        UnaryOperator<String> maiuscula = n -> n.toUpperCase();
        UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + ""; // um modo que "converte" para string
        UnaryOperator<String> exclamacao = n -> n + "!!!";
        
        System.out.println("Usando compósição");
        marcas.stream()
                .map(maiuscula)
                .map(primeiraLetra)
                .map(exclamacao)
                .forEach(print);
        
        
    }
    
}
