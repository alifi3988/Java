/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package relacionamento_desafio;

import java.util.ArrayList;


/**
 *
 * @author alifi
 */
public class Compra {
    
    ArrayList<Item> lista = new ArrayList<>();
    private double troco = 0;
    
    Compra(String nome, double valor, int qtd){
        lista.add(new Item(nome, valor, qtd));
    }

    double valor_a_pagar(){
        double acumulador = 0;
        
        for(Item v:lista){
            acumulador = acumulador + (v.produto.getPreco() * v.getQtd());
        }
        return acumulador;
    }
    
    
    boolean pagar(double inicial){
        
        if(inicial >= valor_a_pagar()){
            this.troco = devolver_troco(inicial);
            System.out.println("Devolver troco de R$ " + this.troco);
            return true; 
        }
        return false;
    }

    double devolver_troco(double inicial){    
        double valor = inicial - valor_a_pagar();
        return valor;
    }
    
    String impressao(){
        String impre = "PRODUTO - PREÇO - QUANTIDADE";
        for(Item i:lista){
            impre = impre + "\n-" + i.produto.getNome() + " - " + i.produto.getPreco() + " - " + i.getQtd();
        }
        impre += "\nValor total: " + this.valor_a_pagar() + 
                "\nDinheiro dado: " + (this.valor_a_pagar() + this.troco) + 
                "\nTroco: " + this.troco;
        
        return impre;
    }
 
}
