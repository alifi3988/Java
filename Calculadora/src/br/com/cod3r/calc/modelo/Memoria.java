package br.com.cod3r.calc.modelo;

import java.util.ArrayList;
import java.util.List;

public class Memoria {


    
    private enum TipoComando{
        ZERAR, NUMERO, DIV, MULT, SUB, SOMA, IGUAL, VIRGULA;
    };

    private static final Memoria instancia = new Memoria();
    
    private final List<MemoriaObservador> observador = new ArrayList<>();
    
    private boolean substituir = false;
    private TipoComando ultimaOperacao = null;
    private String textoAtual = "";
    private String textoBuffer = "";
    
    private Memoria() {
        
    }

    public static Memoria getInstancia() {
        return instancia;
    }
    
    public void adicionarObservador(MemoriaObservador observador){
        this.observador.add(observador);
    }

    public String getTextoAtual() {
        return textoAtual.isEmpty() ? "0": textoAtual;
    }
    
    public void processarComando(String texto){
        
        TipoComando tipoComando = detectarTipoComando(texto);
        
        if(tipoComando == null){
            return;
        }else if(tipoComando == TipoComando.ZERAR){
            textoAtual = "";
            textoBuffer = "";
            substituir = false;
            ultimaOperacao = null;
        }else if(tipoComando == TipoComando.NUMERO || tipoComando == TipoComando.VIRGULA){
            textoAtual = substituir ? texto : textoAtual + texto;
            substituir = false; 
        }else{
            substituir = true; //responsável por substituir valores, após clicar em algum operador
            textoAtual = obterResultadoOperacao();
            textoBuffer = textoAtual;
            ultimaOperacao = tipoComando;
            
        }
        
        
        
        observador.forEach(o -> o.valorAlterado(getTextoAtual()));
    }
    //método que vai retornar um tipo de comando     
    private TipoComando detectarTipoComando(String texto){
        
        //não digitar vários zeros
        if(textoAtual.isEmpty() && texto == "0"){
            return null;
        }      
        
        try {
            // no caso está verificando se o valor passado(texto) 
            // é do tipo numero ou não
            Integer.parseInt(texto);
            return TipoComando.NUMERO;
            
        } catch (NumberFormatException e) {
            //se não for número, vai cair no Catch, e fazer a devida validação, testes
            if("CE".equals(texto)){
                return TipoComando.ZERAR;
            }else if("/".equals(texto)){
                return TipoComando.DIV;
            }else if("+".equals(texto)){
                return TipoComando.SOMA;
            }else if("-".equals(texto)){
                return TipoComando.SUB;
            }else if("x".equals(texto)){
                return TipoComando.MULT;
            }else if(",".equals(texto) && !textoAtual.contains(",")){
                return TipoComando.VIRGULA;
            }else if("=".equals(texto)){
                return TipoComando.IGUAL;
            }
        }
        return null;
    }
    
    private String obterResultadoOperacao() {
        if(ultimaOperacao == null) return this.textoAtual;
        
        //pegando o texto do Buffer, subistituindo a vírgula pelo ".", para realizar a operação
        double numeroBuffer = Double.parseDouble(textoBuffer.replace(",", "."));
        double numeroAtual = Double.parseDouble(textoAtual.replace(",", "."));
        
        double resultado = 0;
        String resultadoString = "";
        
        //operações dos botões
        if(numeroAtual == 0 && ultimaOperacao == TipoComando.DIV) {
            return "Erro! Impossível divisão por 0";
        }else{
            switch (ultimaOperacao) {
                case SOMA:
                    resultado = numeroBuffer + numeroAtual;
                    break;
                case SUB:
                    resultado = numeroBuffer - numeroAtual;
                    break;
                case MULT:
                    resultado = numeroBuffer * numeroAtual;
                    break;
                case DIV:
                    if(numeroBuffer == 0) resultado = 0;
                    else{
                        resultado = numeroBuffer / numeroAtual;
                    }
                default:
                    throw new AssertionError();
            }
        }
        resultadoString = Double.toString(resultado).replace(".", ",");
        
        //se caso retornar um número ",00" passará para inteiro
        boolean inteiro = resultadoString.endsWith(",0");
        return inteiro ? resultadoString.replace(",0", "") : resultadoString;
    }
    
    
    
}
