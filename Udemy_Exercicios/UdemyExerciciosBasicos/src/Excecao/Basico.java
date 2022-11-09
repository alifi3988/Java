/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excecao;

/**
 *
 * @author alifi
 */
public class Basico {
    
    public static void main(String[] args) {
        Aluno a1 = null;
        try{
            imprimirNomeAluno(a1);
        }catch(Exception e){
            System.out.println("Passo um valor Nullo");

        }
        
        
    }
    public static void imprimirNomeAluno(Aluno aluno){
        
        System.out.println(aluno.nome);
    }
    
}
