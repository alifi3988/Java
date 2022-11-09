/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stream;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author alifi
 */
public class FilterProduto {
    
    public static void main(String[] args) {
        
        Produto p1 = new Produto("Tenis Adidas", 250.00, 0.10, 15.00);
        Produto p2 = new Produto("Tenis Filla", 245.00, 0.05, 15.00);
        Produto p3 = new Produto("Tenis Puma", 145.00, 0.00, 15.00);
        Produto p4 = new Produto("Tenis Nike", 255.00, 0.07, 15.00  );
        
        List<Produto> compra = Arrays.asList(p1, p2, p3, p4);
        
        compra.stream()
                .filter(n -> n.desconto > 1)
                .filter(n -> n.preco > 10.00)
                .map(n -> n.nome)
                .forEach(System.out::println);
        
        
    }
    
}
