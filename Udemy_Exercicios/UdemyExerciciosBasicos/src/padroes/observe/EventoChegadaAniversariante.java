/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package padroes.observe;
import java.util.Date;
/**
 *
 * @author alifi
 */
public class EventoChegadaAniversariante {
    
    private final Date momento;

    public EventoChegadaAniversariante(Date momento) {
        this.momento = momento;
    }

    public Date getMomento() {
        return momento;
    }
    
    
    
        
}
