/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lambdas;

/**
 *
 * @author alifi
 */
public class CalculoTeste {
    public static void main(String[] args) {
        Calculo calculo = new Soma();
        System.out.println("Soma: " + calculo.executar(2, 3));

        calculo = new Multiplicar();
        System.out.println("Soma: " + calculo.executar(2, 3));

    }
    
}
