/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package generics;

public class CaixaObjetoTest {
    
    public static void main(String[] args) {
        
        CaixaObjeto caixaA = new CaixaObjeto();
        caixaA.guardar(2.3); //double -> Double (converter)
        
        CaixaObjeto caixaB = new CaixaObjeto();
        caixaB.guardar("Olá");
        
        Double coisaa = (Double) caixaA.abrir();
        String coisab = (String) caixaB.abrir();

        
        System.out.println(coisaa);
        System.out.println(coisab);

    }
}
