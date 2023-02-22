
package classes;


import java.io.BufferedReader;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;



public class Arquivo {
    
    
    public void criandoArquivo(String nomeArquivo){
        
        try{
            //criação do caminho onde será salvo o arquivo
            java.io.File diretorio = new java.io.File("D:\\RepJAVA\\Java\\ProjetoInterface\\src\\arquivos"); 

            ///verificando se o diretório foi ou não criado
            boolean statusDir = diretorio.mkdir();

            //criando um arquivo dentro do diretório
            java.io.File arquivo = new java.io.File(diretorio, nomeArquivo);

            boolean statusArq = arquivo.createNewFile();
            System.out.println(statusDir + " - " + statusArq);
            
        }catch(IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }  
    }

    
    public void escreverArquivo(Leitor leitor, String nomeArquivo){

        //puxando as informações do arquivo
        java.io.File diretorio = new java.io.File("D:\\RepJAVA\\Java\\ProjetoInterface\\src\\arquivos");                     java.io.File arquivo = new java.io.File(diretorio, nomeArquivo);
        

        try {
            //construtor de manipular arquivo
            FileWriter fileWriter = new FileWriter(arquivo, true);
            
            //escrevendo no arquivo
            try ( //Agora vamos usar a classe PrintWriter para escrever fisicamente no arquivo.
                    PrintWriter printWriter = new PrintWriter(fileWriter)) {
                //escrevendo no arquivo
                printWriter.println(leitor);
                //quebra de linha
                //o método flush libera a escrita no arquivo
                printWriter.flush();
                //No final precisamos fechar o arquivo
            }
            
        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        
    }
    
    public ArrayList lerArquivo(String nomeArquivo){
        
        //realizando a importação do arquivo de texto
        java.io.File diretorio = new java.io.File("D:\\RepJAVA\\Java\\ProjetoInterface\\src\\arquivos");
        java.io.File arquivo = new java.io.File(diretorio, nomeArquivo);
        
        //declaração da variavel para que ficrá responsável em armazenar cada linha
        String l = "";
        
        
        //Criação de um Array do tipo leitor para armazer os leitores do arquivos e seus dados
        ArrayList<Leitor> leitores = new ArrayList<>();
        
        //try para realizar a verificação util
        try{
            ///outro Try
            //nesse caso está sendo realizado a abertura do arquivo para leitura
            try (FileReader fr = new FileReader(arquivo); BufferedReader br = new BufferedReader(fr )) {
                
                //lendo cada linha do arquivo e indo para a próxima 
                while (br.ready()) {
                    
                    //leitor para depois add no Array
                    Leitor leitor = new Leitor();
                    
                    //pegando a linha e armazenando
                    l = br.readLine();
                    System.out.println("Linha: " + l);
                   
                    //criação da string que juntara a palavra armazenada
                    String juntando = "";
                    
                    //esse ficará responsável para numerar cada atributo da classe Leitor
                    int numeracao = 1;
                    
                    //criação do char que pegará cada letra
                    char letra = 0;
                   
                    //loop para pegar cada char da frase
                    for (int i = 0; i <= l.length(); i++){
                        System.out.println("i: " + i + " tamanho: " + l.length());
                        
                        if(i < l.length()) letra = l.charAt(i);
                   
                        //verificação se é virgula ou não
                        if(letra != ',' && i < l.length()){
                            
                            //se for diferente de virgula vai entrar
                            //e vai começar a juntra os caracteres para formar uma frase ou palavra
                            juntando = juntando + letra;
                            System.out.println("Juntando 1: " + juntando);
                            if(i == (l.length() - 1)) letra = ',';

                        }else{
                            System.out.println("Letra: " + letra);
                            //se for vírgula quer dizer que a palavra ou frase está pronta
                            System.out.println("Palavra: " + juntando);
                            
                            //verificação de qual atributo a palavra ou frase faz parte
                            System.out.println("Numeração: " + numeracao);
                            switch (numeracao) {
                                case 1 -> {
                                    leitor.setNome(juntando);
                                    numeracao = 2;
                                }
                                case 2 -> {
                                    leitor.setDataNascimento(juntando);
                                    numeracao = 3;
                                }
                                case 3 -> {
                                    leitor.setCpf(juntando);
                                    numeracao = 4;
                                }
                                case 4 -> {
                                    leitor.setRg(juntando);
                                    numeracao = 5;
                                }
                                case 5 -> {
                                    leitor.setSexo(juntando);
                                    numeracao = 6;
                                }
                                case 6 -> {
                                    leitor.setCep(juntando);
                                    numeracao = 7;
                                }
                                case 7 -> {
                                    leitor.setBairro(juntando);
                                    numeracao = 8;
                                }
                                case 8 -> {
                                    leitor.setComplemento(juntando);
                                    numeracao = 9;
                                }
                                case 9 -> {
                                    leitor.setEndereco(juntando);
                                    numeracao = 10;
                                }
                                case 10 -> {
                                    leitor.setNumero(juntando);
                                    numeracao = 11;
                                }
                                case 11 -> {
                                    leitor.setEstado(juntando);
                                    numeracao = 12;
                                }
                                case 12 -> {
                                    leitor.setTelefone(juntando);
                                }

                            }//fim switch 
                            
                            //após escolher qual o atributo é, será zerado/limpado a variavel para recomeçar até o próximo atributo desse leitor
                            juntando = ""; 
                        } //fim else
                    }//fim for    
                   
                    //quando finalzar o for, ele será passado para a proxima linha do arquivo, ou seja, o próximo leitor cadastrado  
                    leitores.add(leitor);
                        
                } //fim while
            }
            return leitores;
            
        }catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }
        return null;
    } 
}
