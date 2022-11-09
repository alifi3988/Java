/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author alifi
 */
public class Principal {
    public static void main(String[] args) {
        
        ///Criei a classe principal para poder mostrar
        
        //Criei um bjeto já com os dados
        //Criei de dois tipos, uma já colocando os dados e o outro retornando null nos campos nome e cpf
        Fisica pf1 = new Fisica("Julia", "4444444444");
        Fisica pf2 = new Fisica();
        
        System.out.println(pf1.imprimir());
        System.out.println(pf2.imprimir());
        
        
     
        
    }
    
}
