/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package padroes.observe;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author alifi
 */
public class Porteiro {
    
    private List<ObservadorChegadaAniversariante> observdores
            = new ArrayList<>();
    
    public void registrarObservadores(ObservadorChegadaAniversariante observador){
        
        this.observdores.add(observador);
    }
    
    public void monitorar(){
        Scanner entrada = new Scanner(System.in);
        
        String valor = "";
        
        while(!"sair".equalsIgnoreCase(valor)){
            System.out.println("Aniversariante chegou?");
            valor = entrada.nextLine();
            
            if("sim".equalsIgnoreCase(valor)){
                
                EventoChegadaAniversariante evento =
                        new EventoChegadaAniversariante(new Date());
                
                observdores.stream()
                        .forEach(o -> o.chegou(evento));
                valor = "sair";
            }else{
                System.out.println("Alarme falso!");
            }
        }
        entrada.close();
    }
    
    
}
