
package polimorfirsmo;

public class Comida {
    
    private double peso;
    

    public Comida(double peso){
        setPeso(peso);
    }
    
    //métodos get e set
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        if(peso >= 0){
            this.peso = peso;
        }
    }
}
