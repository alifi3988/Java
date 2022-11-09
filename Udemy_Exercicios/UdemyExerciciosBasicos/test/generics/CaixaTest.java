/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package generics;

public class CaixaTest {
    public static void main(String[] args) {
        
    
        Caixa<String> caixaA = new Caixa<>();
        caixaA.guardar("Segredo");

        Caixa<Double> caixaB = new Caixa<>();
        caixaB.guardar(3.1415);

        System.out.println(caixaA.abrir());
        System.out.println(caixaB.abrir());
    
    }
}
