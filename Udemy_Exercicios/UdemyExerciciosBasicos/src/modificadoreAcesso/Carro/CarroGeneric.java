package modificadoreAcesso.Carro;

public class CarroGeneric {
    
    /***
     * 
     * public - todo mundo vê
     * private - somente a classe
     * pacote ou default - padrão, visto pelo pacote
     * protected - somente na herança
     *   
     ***/
    
    public String cor;
    public String modelo;
    private double veloMaxima;
    private double veloAtual;
    private double kmAndado;
    public String placa;
    private double gasolina;
    
    //criação do método CarroGeneric da classe, com todos os atributos vazio
    public CarroGeneric(){
        this.cor = "";
        this.modelo = "";
        this.veloMaxima = 0;
        this.veloAtual = 0;
        this.kmAndado = 0;
        this.placa = "000-000";
        this.gasolina = 0;
    }
    

    
    //criação do método para Criar um novo carro
    public void NovoCarro(String cor, String modelo, double veloMaxima, double veloAtual, double kmAndado, String placa, double gasolina){
        this.cor = cor;
        this.modelo = modelo;
        this.veloMaxima = veloMaxima;
        this.veloAtual = veloAtual;
        this.kmAndado = kmAndado;
        this.placa = placa;
        this.gasolina = gasolina;
    }
    
    
    
}
