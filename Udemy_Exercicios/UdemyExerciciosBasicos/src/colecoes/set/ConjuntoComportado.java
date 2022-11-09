/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colecoes.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author alifi
 */
public class ConjuntoComportado {
    public static void main(String[] args) {
        
        
        //Desse modom obrigatóriamente, add somente os tipos que estiver dentro do <>
        //Set<String> lista = new HashSet<String>();
        Set<String> lista = new TreeSet<>(); //ordena conforme a inserção
        lista.add("Alifi");
        lista.add("Carlos");
        lista.add("Lucas");
        lista.add("Igor");
        
        System.out.println(lista);
        for(String candidados:lista){
            System.out.println(candidados);
        }
        
        
    }
    
}
