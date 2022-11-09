/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stream;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author alifi
 */
public class OutrasApi {
    
    public static void main(String[] args) {
        
        
        Aluno a1 = new Aluno("Ana", 7.1);
        Aluno a2 = new Aluno("Luna", 6.1);
        Aluno a3 = new Aluno("Gui", 8.1);
        Aluno a4 = new Aluno("Gabi", 10.0);
        Aluno a5 = new Aluno("Ana", 7.1);
        Aluno a6 = new Aluno("Pedro", 6.1);
        Aluno a7 = new Aluno("Gui", 8.1);
        Aluno a8 = new Aluno("Ariana", 10.0);
        
        List<Aluno> alunos =
                Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8);
        
        System.out.println("distinct...");
        alunos.stream().distinct().forEach(System.out::println); //mostrar os não repetidos (nome e valor
        //tem que definir o equals e o hashCode
        
        System.out.println("\nSkip e Limit");
        alunos.stream()
                .distinct()
                .skip(1) //pular
                .limit(2) //limitar quntos quer que aparece 
                .forEach(System.out::println);
        
        System.out.println("\nTakeWhile");
        alunos.stream()
                .distinct()
                .takeWhile(a -> a.media >= 7)
                .forEach(System.out::println);
        
        
        
        
    }
    
}
