/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Desafio;

/**
 *
 * @author alifi
 */
public class Jantar {
    public static void main(String[] args) {
        //estanciando a classe comida
        double peso = 0;
        Comida c1 = new Comida();
        Comida c2 = new Comida();

        c1.comida("Arroz", 300.5);
        c2.comida("Feijão", 200.5);
        System.out.println(c1.mostrar());
        System.out.println(c2.mostrar());
              
        //Estanciando a classe pessoa
        Pessoa p1 = new Pessoa();
        p1.nome = "João";
        p1.peso = 99.8;
        p1.comer(c1);
        p1.comer(c2);    
        System.out.println(p1.mostrar());
    }
    
}
