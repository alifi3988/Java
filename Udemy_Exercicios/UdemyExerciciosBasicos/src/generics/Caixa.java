/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package generics;

/**
 *
 * @author alifi
 */
public class Caixa<TIPO> {
    
    private TIPO coisa;
    
    public void guardar(TIPO coisa){
        this.coisa = coisa;
    }
    
    public TIPO abrir(){
        return this.coisa;
    }
    
}