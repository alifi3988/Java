/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Desafio;

/**
 *
 * @author alifi
 */
public class Comida {
        String nome = "";
        double peso = 0;
        
        public void comida(String n, double p){
            this.nome = n;
            this.peso = p;
        }
        
        public String mostrar(){
            String texto = "";
            
            texto = "Nome: " + nome + "\nPeso: " + peso;
        
            
            return texto;
            
        }
    
}
