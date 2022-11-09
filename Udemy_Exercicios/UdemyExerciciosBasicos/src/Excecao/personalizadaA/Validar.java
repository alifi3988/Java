/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excecao.personalizadaA;

import Excecao.Aluno;

/**
 *
 * @author alifi
 */
public class Validar {

    private Validar() {
    }
    
    public static void aluno(Aluno aluno){
        
        if(aluno == null){
            throw new IllegalArgumentException("O aluno está vazio!");
        }
        if(aluno.nome == null || aluno.nome.trim().isEmpty()){
            throw  new StringVaziaException("nome");
        }
        if(aluno.media < 0 || aluno.media > 10){
            throw  new NumeroForaIntervalo("nota");
        }
        
        
    }
    
    
    
}
