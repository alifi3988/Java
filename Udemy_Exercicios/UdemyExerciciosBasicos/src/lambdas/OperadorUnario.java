/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lambdas;

import java.util.function.UnaryOperator;

/**
 *
 * @author alifi
 */
public class OperadorUnario {
    public static void main(String[] args) {
        UnaryOperator<Integer> maisDois = n -> n + 2;
        UnaryOperator<Integer> vezesDois = n -> n *2;
        UnaryOperator<Integer> aoQuadrado = n -> n *n;
        
        //utilizando o AndThen
        int resultado1 = maisDois
                .andThen(vezesDois)
                .andThen(aoQuadrado)
                .apply(0);
        System.out.println("Valor 1: " + resultado1);
        
        //utilizando o Compose
        int resultado2 = aoQuadrado
                .compose(vezesDois)
                .compose(maisDois)
                .apply(0);
        System.out.println("Valor 2: " + resultado2);
        
        //os resultados são os mesmo, todavia, o modo de chamar e a ordem são diferentes
        
    }
    
}
