/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author alifi
 */
//criei uma classe "forma", básica
public class Pessoa {
    
    //o atributo nome, será passado em forma de herança para as outras classes
    //no caso, coloquei ele como protected para ser utilizado pelas classes que herdar
    private String nome;
    
    public Pessoa(){
        
    }
    
    //os métodos gets e sets, que serão utilizados para pegar e informar um valor dos atributos
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    
    
}
