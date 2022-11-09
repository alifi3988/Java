/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Heranca.desafio;

/**
 *
 * @author alifi
 */
public class Principal {
    public static void main(String[] args) {
        
        //Instanciando os carros
        Carro c1 = new Gol();
        Carro c2 = new Ferrari();
        
        c1.acelerar();
        c2.acelerar();
        c1.acelerar();
        c2.acelerar();
        
        System.out.println("Carro 1: \nVelocidade Atual: " + c1.velo_atual);
        System.out.println("Carro 2: \nVelocidade Atual: " + c2.velo_atual);
        
        c1.freiar();
        c2.freiar();
        c1.freiar();
        c2.freiar();
        c1.freiar();
        c2.freiar();
        
        System.out.println("Carro 1: \nVelocidade Atual: " + c1.velo_atual);
        System.out.println("Carro 2: \nVelocidade Atual: " + c2.velo_atual);
        
        
    }
    
}
