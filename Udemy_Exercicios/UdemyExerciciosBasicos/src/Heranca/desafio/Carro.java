/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Heranca.desafio;

/**
 *
 * @author alifi
 */
public class Carro {
    
    final int VELOCIDADE_MAXIMA;
    double velo_atual;
    int delta = 5;
    
    //iniciando o carro com a velocidade 0    
    Carro(int velocidadeMaxima){
        VELOCIDADE_MAXIMA = velocidadeMaxima;
    }
    
    void acelerar(){
        if(this.velo_atual + delta > VELOCIDADE_MAXIMA){
            this.velo_atual = VELOCIDADE_MAXIMA;
        }else{
            this.velo_atual = this.velo_atual + delta;
        }
    }
    
    void freiar(){
        if(this.velo_atual > 0){
            this.velo_atual = this.velo_atual - 5;
        }
    }
}
