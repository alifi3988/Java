/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package lambdas;

/**
 *
 * @author alifi
 */
@FunctionalInterface //diz que na interface pode haver somente um método
public interface Calculo {
    double executar(double a, double b);
        
}
