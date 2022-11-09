/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author alifi
 */

//realizei a herança com a classe Fisica
public class Fisica extends Pessoa{
    
    private String cpf;
    
    public Fisica(){
        
    }
    
    //nesse campo é visivel eu pegando o atributo nome pelo método
    public Fisica(String nome, String cpf){
        this.setCpf(cpf);
        this.setNome(nome);
    }

    String getCpf() {
        return cpf;
    }
    void setCpf(String cpf) {
        this.cpf = cpf;
    }
   
    public String imprimir(){
        String nome = this.getNome();
        String cpf = this.getCpf();
        String dados = "Nome: " + nome + " - CPF: " + cpf;
        return dados;
    }
    
    
    
}
