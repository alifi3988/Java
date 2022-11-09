/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 *
 * @author alifi
 */
public class Consumidor {
    public static void main(String[] args) {
        
        Consumer<Produto> imprimir = p -> System.out.println(p.nome);
        
        Produto p1 = new Produto("Caneta", 12.34, 0.09);
        
        imprimir.accept(p1);
        
        Produto p2 = new Produto("Notebook",12.34, 0.09);
        Produto p3 = new Produto("Caderno", 17.90, 0.09);
        Produto p4 = new Produto("Lápis", 5.40, 0.01);
        
        
        List<Produto> produtos = Arrays.asList(p2,p3,p4);
        
        produtos.forEach(imprimir);
        
        produtos.forEach(p-> System.out.println(p.preco));
        
        produtos.forEach(System.out::println);
    }
    
}
