/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfirsmo;

import javax.swing.JOptionPane;

/**
 *
 * @author alifi
 */
public class Jantar {
    
    public static void main(String[] args) {
        
        //Criação dos objetos
        Pessoa convidado = new Pessoa(68.5);
        double inicial = convidado.getPeso();
        
        
        
        Comida arroz = new Arroz(0.300);
        Comida feijao = new Feijao(0.200);
        Comida sorvete = new Sorvete(0.200);
        
        convidado.comer(arroz);
        convidado.comer(feijao);
        convidado.comer(sorvete);
        
        double finalP = convidado.getPeso();
        
        System.out.println("Peso inicial: " + inicial);
        System.out.println("Peso final: " + finalP);
        
        
        String a = JOptionPane.showInputDialog(null, "Informe");
        
        
      
    }
    
}
