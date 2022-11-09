
package relacionamento_desafio;

import java.util.Scanner;

public class Cliente {
    
    public static void main(String[] args) {
        Compra c1 = null;
        Scanner entrada = new Scanner(System.in);
        String produto;
        double valor;
        double dinheiro, restante = 0;
        int qtd;
        
        System.out.println("SISTEMA DE COMPRA!");
        System.out.println(" ==========================");
        for(int i = 0; i < 5; i++){
            System.out.print("Informe o produto: ");
            produto = entrada.next();
            
            System.out.print("Informe o valor: ");
            valor = entrada.nextDouble();
            
            System.out.print("Informe a quantidade: ");
            qtd = entrada.nextInt();
            
            c1 = new Compra(produto, valor, qtd);
        }
        System.out.println(" ==========================");
        System.out.println("O valor da compra deu: R$" + c1.valor_a_pagar());
        System.out.print("Informe o valor dado para pagar: ");
        dinheiro = entrada.nextDouble();
        while(true){
            if(c1.pagar(dinheiro)){
                System.out.println("Pago com sucesso!");
                System.out.println(" * * * IMPRESSÃO DA COMPRA * * *");
                c1.impressao();
                break;
            }else{
                System.out.println("Valor insuficiente! Falta " + (c1.valor_a_pagar() - dinheiro));
                    System.out.print("Informe o restate dado para completar: ");
                    restante = entrada.nextDouble();
            }
            
            dinheiro = dinheiro + restante;
        }
            
        }          
    }
