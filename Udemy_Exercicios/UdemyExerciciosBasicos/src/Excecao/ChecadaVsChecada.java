/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excecao;

import com.sun.jdi.event.ExceptionEvent;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alifi
 */
public class ChecadaVsChecada {
    public static void main(String[] args) {
        try {
            gerarErro01();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        try {
            gerarErro02();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
        System.out.println("Fim!");
    }
    
    //Exceção não checada ou não verificada
    private static void gerarErro01() {
        throw new RuntimeException("Ocorreu um erro bem legal! #01");
        //throw -> lance        
    }
    
    //Exceção chegada ou verificada
    private static void gerarErro02() throws Exception {
        throw new Exception("Ocorreu um erro bem legal! #02");
    }

    
}
