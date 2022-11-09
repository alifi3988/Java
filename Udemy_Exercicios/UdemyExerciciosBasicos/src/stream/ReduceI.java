/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

/**
 *
 * @author alifi
 */
public class ReduceI {
    public static void main(String[] args) {
        
        
        List<Integer> numbs = Arrays.asList(1,2,3,4,5,6,7,8,9);
        
        BinaryOperator<Integer> soma = (ac, n) -> ac + n;
        
        int total = numbs.stream().reduce(soma).get();
        
        System.out.println("Total: " + total);
    }
    
}
