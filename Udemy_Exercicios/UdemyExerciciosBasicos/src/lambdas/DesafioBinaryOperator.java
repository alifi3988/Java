/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lambdas;

import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

/**
 *
 * @author alifi
 */
public class DesafioBinaryOperator {
    
    public static void main(String[] args) {
                
        Function<Produto, Double> precoFinal = 
                produto -> produto.preco * (1 - produto.desconto);
        UnaryOperator<Double> impostoMunicipal = 
                preco -> preco >= 2500 ? preco * 1.085 : preco;
        UnaryOperator<Double> frete = 
                preco -> preco >= 3000 ? preco + 100 : preco + 50;
        UnaryOperator<Double> arredondar = 
                preco -> Double.parseDouble(String.format("%.2f", preco));
        Function<Double, String> formatar = 
                preco -> ("R$" + preco).replace(".", ",");
        
        Produto p = new Produto("iPad", 3235.89, 0.13);
        String preco = precoFinal
                .andThen(impostoMunicipal)
                .andThen(frete)
                .andThen(arredondar)
                .andThen(formatar)
                .apply(p);
        
        System.out.println("Preço final: " + preco);
        
    }
    
}
