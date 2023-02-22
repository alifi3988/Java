
package classes;

public class Usuarios {
    
    //atributos
    private int id_usuario;
    private String nome_usuario;
    private String usuario;
    private String senha;
    private boolean estado;

    public Usuarios(int id_usuario, String nome_usuario, String usuario, String senha, boolean estado) {
        super();
        this.id_usuario = id_usuario;
        this.nome_usuario = nome_usuario;
        this.usuario = usuario;
        this.senha = senha;
        this.estado = estado;
    }
    
    //métodos
    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNome_usuario() {
        return nome_usuario;
    }

    public void setNome_usuario(String nome_usuario) {
        this.nome_usuario = nome_usuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    //métodos adicionais
    public String recuperacaoUsuario(){
        
        String user = ""+getUsuario() + 
                ""+getSenha();
        return user;
    }

    @Override
    public String toString() {
        
        String user = "";
        
        user = "ID Usuario: " + getId_usuario() + 
               " Nome: " + getNome_usuario() + 
               " Usuario: " + getUsuario() + 
               " Senha: " + getSenha();
        
        return user;
    }
    
    
}
