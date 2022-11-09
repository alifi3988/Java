/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excecao.personalizadaB;

import Excecao.Aluno;

/**
 *
 * @author alifi
 */
public class TesteValidacoes {
    public static void main(String[] args) throws StringVaziaException, NumeroForaIntervalo {
        
        try {
            Aluno a1 = new Aluno("Alifi", 100);
            
            Validar.aluno(a1);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        
        System.out.println("Fim!");
    }
    
}
