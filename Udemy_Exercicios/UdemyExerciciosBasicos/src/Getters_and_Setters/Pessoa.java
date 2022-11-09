
package Getters_and_Setters;


public class Pessoa {
    
    private int idade;
    
    public Pessoa(int idade){
        setIdade(idade);
    }
    
    //criação dos métodos getters e setters
    public int getIdade() {
        return idade;
    }
    
    public void setIdade(int idade) {
        if(idade >= 0 && idade <= 120){
            this.idade = idade;
        }
    }
    
    
    
}
