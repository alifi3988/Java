package classes;

import javax.swing.JOptionPane;

public class Mensagens extends javax.swing.JOptionPane {

    
    //OS ICONES, FOI BASEADOS NO SITE 
    //https://www.oreilly.com/library/view/javatm-how-to/9780133813036/ch12lev2sec6.html
    
    public void mensagemAlerta(String mensagem){
        
        showMessageDialog(
                null,   
                mensagem, 
                "Informativo", 
                WARNING_MESSAGE);
    }
    
    public void mensagemInformativa(String mensagem){
        showMessageDialog(
                null, 
                mensagem, 
                "Informativo", 
                INFORMATION_MESSAGE);
    }
 
    public void mensagemErro(String mensagem){
        showMessageDialog(
                null, 
                mensagem, 
                "Informativo", 
                ERROR_MESSAGE);
    }

    public void mensagemLeitorDados(Leitor leitor) {
        
        String mensagem;
        
        mensagem = "ID Leitor: " + leitor.getId_leitor() + 
                "\nNome Leitor: " + leitor.getNome() + 
                "\nData de nascimento: " + leitor.getDataNascimento() + 
                "Endereço: " + leitor.getEndereco() + ", " + leitor.getNumero() + ", " + leitor.getBairro() + ", " + leitor.getCep();
        
        showMessageDialog(null, mensagem, "Dados do Leitor", INFORMATION_MESSAGE);
        
    }
 
}
