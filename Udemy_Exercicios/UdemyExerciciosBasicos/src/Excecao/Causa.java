/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excecao;

/**
 *
 * @author alifi
 */
public class Causa {
    
    public static void main(String[] args) {
        
        //verifiando a casua real do erro
        
        try {
            metodoA(null);
        } catch (IllegalArgumentException e) {
            if(e.getCause() != null){
                System.out.println(e.getMessage());
            }
        }
        
        
    }
    static void metodoA(Aluno aluno){
        try {
            metodoB(aluno);
        } catch (Exception causa) {
            throw new IllegalArgumentException(causa);
        }
    }
    
    static void metodoB(Aluno aluno){
        if(aluno == null){
            throw new NullPointerException("Aluno está nullo! Verificar!");
        }
        System.out.println("Aluno: " + aluno.nome);
    }
    
}
