/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excecao.personalizadaA;

/**
 *
 * @author alifi
 */
public class StringVaziaException extends RuntimeException{
    
    private String nomeDoAtributo;
    
    public StringVaziaException(String  nomeDoAtributo) {
        this.nomeDoAtributo = nomeDoAtributo;
        
    }
    
    public String getMensagem(){
        return String.format("O atributo '%s' está vazio ", nomeDoAtributo);
    }
    
}
