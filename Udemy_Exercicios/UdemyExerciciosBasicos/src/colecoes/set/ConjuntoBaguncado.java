/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colecoes.set;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author alifi
 */
public class ConjuntoBaguncado {
    public static void main(String[] args) {
        
        //criando a coleção HshSet
        //suporta diferentes tipos dentro dele, mas não cehga a ser o idel em uma escolha ordenada
        HashSet conjunto = new HashSet();
        
        
        conjunto.add(1);
        conjunto.add("String");
        conjunto.add(4.54);
        conjunto.add('@');
        conjunto.add(false);
        
        System.out.println(conjunto.remove(2)); //removendo um valor
        System.out.println(conjunto.contains(2)); //verificando se contém um valor
        System.out.println("Tamanho do conjunto: " + conjunto.size()); //verificando o tamanho
        System.out.println(conjunto);
        
        //união e intersecção de dois conjuntos
        Set con = new HashSet(); //uma das forma de intanciar o HAshSet
        
        con.add(1);
        con.add("String");
        con.add(4.54);
        con.add('@');
        con.add(false);
        
        System.out.println("Conjunto 1: " + conjunto);
        System.out.println("Conjunto 2: " + con);
        
        //união e intersecção
        conjunto.addAll(con); //união
        conjunto.retainAll(con); //intersecção
        conjunto.clear(); //limpar conjunto
        System.out.println("União dos dois: " + conjunto);
        //intersecção
        
    }
    
}
