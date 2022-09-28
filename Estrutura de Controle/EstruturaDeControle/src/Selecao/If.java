
/*
Será criado um ex. básico, explicando a estrutura de seleção IF, ELSE IF, ELSE
Ex. tirado de: https://www.beecrowd.com.br/judge/pt/problems/view/1041
>> beecrowd >> problems >> iniciantes >> 1041

Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas de um ponto em um plano. 
A seguir, determine qual o quadrante ao qual pertence o ponto,
ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).

Se o ponto estiver na origem, escreva a mensagem “Origem”.
Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a situação

Entrada
A entrada contem as coordenadas de um ponto.

Saída
A saída deve apresentar o quadrante em que o ponto se encontra.

*/

//importação de pacotes
package Selecao;
import java.util.Scanner;

//início da classe
public class If {
    
    public static void main(String[] args) {
        
        //Classe Scanner para "ler" determinado valor
        Scanner entrada = new Scanner(System.in);
        
        //definição das variaveis
        double x, y;
        String resultado = "";
        
        //entrad dos valores
        System.out.print("Informe o primeiro valor da cordenada (X): ");
        x = entrada.nextDouble();
        
        System.out.print("Informe o segundo valor da cordenada (Y): ");
        y = entrada.nextDouble();
        
        //verificação
        //se x IGUAL 0 E y IGUAL 0 => então a variavel resultado receberá o valor "Origem"
        if(x == 0 && y == 0) resultado = "Origem";
        
        else if(x == 0.0 && y > 0.0) resultado = "Eixo X";
        else if(x > 0.0 && y == 0.0) resultado = "Eixo Y";
        else if (x > 0.0 && y > 0.0) resultado = "Q1";
        else if (x > 0.0 && y < 0.0) resultado = "Q4";
        else if (x < 0.0 && y > 0.0) resultado = "Q2";
        else if(x < 0.0 && y < 0.0) resultado = "Q3";

        System.out.println(resultado);
    }
}