/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package generics;
/**
 *
 * @author alifi
 */
public class ParesTest {
   
    public static void main(String[] args) {
        Pares<Integer, String> resultadoConcurso = new Pares<>();
        
        resultadoConcurso.adicionar(1, "Maria");
        resultadoConcurso.adicionar(2, "Pedro");
        resultadoConcurso.adicionar(3, "Gui");
        resultadoConcurso.adicionar(4, "Joao");
        resultadoConcurso.adicionar(2, "Alifi");
        
        for(int i = 1; i < 5; i++){
            System.out.println(resultadoConcurso.getValor(i));
        }
    }
    
}
