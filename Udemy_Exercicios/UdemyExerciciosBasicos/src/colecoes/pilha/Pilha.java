/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colecoes.pilha;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 *
 * @author alifi
 */
public class Pilha {
    public static void main(String[] args) {
        
        Deque<String> livro = new ArrayDeque<>();
        
        livro.add("O pequeno Principe");
        livro.push("A volta dos que não foram");
        livro.push("O Hobbit");
        System.out.println(livro);

        
        
        System.out.println(livro.peek());
        System.out.println(livro.element());
        
        System.out.println(livro.pop());
        System.out.println(livro.poll());
        System.out.println(livro.remove());
        
        System.out.println(livro);
        
        
    }
    
}
