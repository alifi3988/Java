/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lambdas;

import java.util.function.Predicate;

/**
 *
 * @author alifi
 */
public class Predicado {
    public static void main(String[] args) {
        
        //predicate recebe um valor e retorna verdadeiro pou falso
        
        Predicate<Produto> isCaro = 
                prod -> prod.preco >= 7500;
        Produto produto = new Produto("Notebook", 3893.89, .15);
        System.out.println(isCaro.test(produto));
    }
    
}
