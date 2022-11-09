/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import lambdas.Predicado;

/**
 *
 * @author alifi
 */
public class Filter {
    public static void main(String[] args) {
        
        Aluno a1 = new Aluno("Ana", 7.8);
        Aluno a2 = new Aluno("Bia", 5.8);
        Aluno a3 = new Aluno("Daniel", 9.8);
        Aluno a4 = new Aluno("Gui", 6.8);
        Aluno a5 = new Aluno("Rebeca", 7.1);
        Aluno a6 = new Aluno("Pedro", 8.8);
        
        Predicate<Aluno> aprovados = a -> a.media >=7;
        
        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);
        alunos.stream()
                .filter(aprovados)
                .map(a -> "Parabéns " + a.nome + ", você foi aprovado!")
                .forEach(System.out::println);
        
        
    }
    
}
