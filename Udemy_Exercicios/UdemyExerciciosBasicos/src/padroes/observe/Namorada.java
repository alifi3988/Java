/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package padroes.observe;

/**
 *
 * @author alifi
 */
public class Namorada implements ObservadorChegadaAniversariante{

    @Override
    public void chegou(EventoChegadaAniversariante evento) {
        System.out.println("Avisar convidados!");
        System.out.println("Apagar as luzes...");
        System.out.println("Esperar um pouco...");
        System.out.println("...S U R P R E Z A ! ! !");
    }


    
}
