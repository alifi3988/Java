/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Selecao;

import java.util.Scanner;

/**
 *
 * @author alifi
 */
public class SwitchCase {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int mes;
        String resultado = "";
        
        System.out.print("Informe o mês, por número: ");
        mes = entrada.nextInt();
        
        //entrada da seleção
        switch(mes){
            
            //escolherá o bloco que será executado, de acordo com a entrada
            case 1:
                resultado = "Janeiro";
                
                //após escolher um bloco, o break se responsabiliza em finalizar a estrutura e não executar tudo
                break;
            case 2:
                resultado = "Fevereiro";
                break;
            case 3:
                resultado = "Março";
                break;
            case 4:
                resultado = "Abril";
                break;
            case 5:
                resultado = "Maio";
                break;
            case 6:
                resultado = "Junho";
                break;
            case 7:
                resultado = "Julho";
                break;
            case 8:
                resultado = "Agosto";
                break;
            case 9:
                resultado = "Setembro";
                break;
            case 10:
                resultado = "Outubro";
                break;
            case 11:
                resultado = "Novembro";
                break;
            case 12:
                resultado = "Dezembro";
                break;
                
            //caso a etrada não for compatível com nenhum dos blocos anteriores
            default:
                resultado = mes + " não Existe!";
        }
        
        System.out.println("Mês: " + resultado);
        
        
        
    }
    
}
