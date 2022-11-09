/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExerciciosBasicos;

/**
 *
 * @author alifi
 */
public class TipoString {
    
    public static void main(String[] args){
        
        System.out.println("Ola Pessoal".charAt(0));
        //mostra a letra de uma frase começando do 0 (primeira letra) 
        //o espaço é contato como um caracter
        
        String s = "Boa tarde";
        
        System.out.println(s.concat("!!!")); //adcionar 
        //seria o mesmo que usasse
        System.out.println(s + "!!!");
        
        //verifica, retorna boolean se há a palavra informada
        System.out.println(s.startsWith("Boa")); 
        
        System.out.println(s.toLowerCase().startsWith("boa"));
        //como S é uma string, e após contém dois métodos verificadosres, referente a uma string
        //podem ser usados em seguidas
        //toLowerCase -> minuscula
        
        System.out.println(s.toUpperCase().endsWith("TARDE"));
        //toUpperCase -> Maiúscula
        
        System.out.println(s.length());
        //não identifiquei ainda
        
        System.out.println(s.toLowerCase().equals("boa tarde"));
        //verificando se há o informado
        
        System.out.println(s.equalsIgnoreCase("boa tarde"));
        //vendo se não tem o que foi informado
        
        System.out.println(s.indexOf("t"));
        //informa a localização do informado
        
        System.out.println(s.substring(6));
        //mostra a partir do número que informar (posição)
        
        System.out.println(s.substring(5, 8));
        //mostra de acordo com o período informado
        
        
        var nome = "Álifi";
        var sobrenome = "Santos";
        var idade = 22;
        var salario = 12345.987;
        
        System.out.println("Nome: " + nome + "\nSobrenome: " + sobrenome + "\nIdade: " + idade + "\nSalario: " + salario);
        
        System.out.printf("O senhor %s %s tem %d anos e ganha R$%.2f.",
                nome, sobrenome, idade, salario);
        //Utiliza o %.2f para definir o número de casas decimais, ele arredonda.    
        
        
    }
    
}
