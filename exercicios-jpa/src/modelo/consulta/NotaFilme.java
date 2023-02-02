/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.consulta;

/**
 *
 * @author alifi
 */
public class NotaFilme {
    
    private double media;

    public NotaFilme() {
    }

    public NotaFilme(double media) {
        super();
        this.media = media;
    }
    
    //MÉTODOS GUETTERS E SETES
    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }
}
