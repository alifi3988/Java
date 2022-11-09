/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author alifi
 */
public class Match {
    public static void main(String[] args) {
        
        Aluno a1 = new Aluno("Ana", 7.1);
        Aluno a2 = new Aluno("Luna", 4.1);
        Aluno a3 = new Aluno("Gui", 8.1);
        Aluno a4 = new Aluno("Gabi", 10.0);
        
        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);
        
        Predicate<Aluno> aprovado = a -> a.media >= 7;
        
        //verificar se todos são aprovados
        System.out.println("Todos foram aprovados: " + alunos.stream().allMatch(aprovado));
        
        //verificar se algum foi aprovado
        System.out.println("Algum foi aprovado: " + alunos.stream().anyMatch(aprovado));
        
        //Ninguém foi reporvado
        System.out.println("Ninguém foi reporvado: " + alunos.stream().noneMatch(aprovado));
        
        
        
    }
    
}
