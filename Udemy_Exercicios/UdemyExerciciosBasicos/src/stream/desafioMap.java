/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

/**
 *
 * @author alifi
 */
public class desafioMap {
    
    public static void main(String[] args) {
        
        //criando uma lista de números para realizar as operações
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
        
        
        UnaryOperator<String> inverter = s -> new StringBuilder(s).reverse().toString();
        Function<String, Integer> binForInt = s-> Integer.parseInt(s, 2);
        
        numbers.stream()
                .map(Integer::toBinaryString)
                .map(inverter)
                .map(binForInt)
                .forEach(System.out::println);
        
    }
    
}
