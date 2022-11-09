/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Heranca.desafio;

/**
 *
 * @author alifi
 */
public class Ferrari extends Carro{

    Ferrari() {
        this(215);
    }

    public Ferrari(int velocidadeMaxima) {
        super(velocidadeMaxima);
        delta = 15;
    }
          
}
