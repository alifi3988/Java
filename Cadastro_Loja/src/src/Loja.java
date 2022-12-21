
package src;

public class Loja {
    
    //atributos da Classe Loja
    //não add final, visto que pode haver mudanças,
    //assim prefiro ter a opção de realizar a mudança no dado
    private String nome;
    private String cnpj;
    private String telefone;
    private String loc;
    private boolean status;
    
    //construtores
    
    //Loja null
    public Loja() {
        this.nome = null;
        this.cnpj = null;
        this.telefone = null;
        this.loc = null;
        this.status = false;
    }
    
    //Add os dados
    public Loja(String nome, String cnpj, String telefone, String loc, boolean status) {
        super();
        this.nome = nome;
        this.cnpj = cnpj;
        this.telefone = telefone;
        this.loc = loc;
        this.status = status;
    }
    
    //métodos Gets & Set
    
    // GETS
    public String getCnpj() {
        return cnpj;
    }

    public String getLoc() {
        return loc;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }
    
    public boolean getStatus(){
        return status;
    }
    
    //SET
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        String loja = "";
        
        loja = "Nome da Loja: " + getNome();
        loja = loja + "CNPJ: " + getCnpj();
        loja = loja + "Telefone: " + getTelefone();
        loja = loja + "Localização: " + getLoc();
        loja = loja + "Status: " + getStatus();
        
        return loja;      
    }
    
    
    
    
    
    
    
    
    
    
}
