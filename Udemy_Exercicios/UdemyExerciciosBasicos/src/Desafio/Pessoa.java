/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Desafio;

/**
 *
 * @author alifi
 */
public class Pessoa {
    String nome = "";
    double peso = 0;
       
    public void comer(Comida comida) {   
        if(comida != null){
            peso+=comida.peso;
        }else{
            System.out.println("Comida vazia!");
        }
        
    }
  
    public void criar_pessoa(String n, double p){
        this.nome = n;
        this.peso = p;
    }
    
    public String mostrar(){
        
        return "\nNome: " + this.nome + "\nPeso: " + this.peso;
        
    }
}
