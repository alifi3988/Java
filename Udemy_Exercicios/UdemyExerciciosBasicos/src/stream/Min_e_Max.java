/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author alifi
 */
public class Min_e_Max {
    
    public static void main(String[] args) {
        
        
        
        Aluno a1 = new Aluno("Ana", 7.1);
        Aluno a2 = new Aluno("Luna", 6.1);
        Aluno a3 = new Aluno("Gui", 8.1);
        Aluno a4 = new Aluno("Gabi", 10.0);
        
        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);
        
        Comparator<Aluno> melhorNota = (a5, a6) -> {
            if (a5.media > a6.media) return 1;
            if (a5.media < a6.media) return -1;
            return 0;
        };
        
        Comparator<Aluno> piorNota = (a5, a6) ->{
          if (a5.media > a6.media) return -1;
          if (a5.media < a6.media) return 1;
          return 0;
        };
        
        System.out.println(alunos.stream().max(melhorNota).get());
        System.out.println(alunos.stream().min(piorNota).get());
        
        System.out.println(alunos.stream().min(melhorNota).get());
        System.out.println(alunos.stream().max(piorNota).get());
        
        
    }
    
}
