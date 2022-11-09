/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stream;

/**
 *
 * @author alifi
 */
public class Media {
    
    private double total;
    private int qtd;
    
    public Media adicionar(double valor){
        this.total+= valor;
        this.qtd++;
        return this;
    }
    
    public String getValor(){
        return "Média: " + (total / qtd);
    }
    
    public static Media combinar(Media m1, Media m2){
        Media resultante = new Media();
        resultante.total = m1.total + m2.total;
        resultante.qtd = m1.qtd + m2.qtd;
        return resultante;
    }
    
}
