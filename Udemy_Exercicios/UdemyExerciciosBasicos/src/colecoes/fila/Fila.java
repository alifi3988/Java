/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colecoes.fila;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author alifi
 */
public class Fila {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();
        
        //ambos add elementos na fila
        fila.add("Ana"); //da erro se atingir o limite
        fila.offer("Bia"); //devolve false se atingir o limite
        
        //mostrar
        
        //A diferença entre os dois, é quando a fila está vazia
        //peek - retorna null
        ///element - lança uma exceção
        System.out.println(fila.peek()); //retorna o primeiro valor, mas não tira
        System.out.println(fila.element()); //retorna o primeiro valor, mas não tira
        
        //remover
        System.out.println(fila.poll());  //remover o primeiro elemento, e retorna falso, quando estiver vazia
        System.out.println(fila.remove()); //remove da fila, mas retorna uma exceção, quando estiver vazia
        
        
    }
    
}
