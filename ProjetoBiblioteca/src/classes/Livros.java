
package classes;


public final class Livros {
    
    
    private int idLivro;
    private String nome;
    private String autor;
    private String editora;
    private String dataEntrada;
    private String genero;
    private boolean status;
    private String corredor;
    private String pratilheira;
    private String setor;

    public Livros(String nome, String autor, String editora, String dataEntrada, String genero, boolean status, String corredor, String pratilheira, String setor) {
        setNome(nome);
        setAutor(autor);
        setEditora(editora);
        setDataEntrada(dataEntrada);
        setGenero(genero);
        setStatus(status);
        setCorredor(corredor);
        setPratilheira(pratilheira);
        setSetor(setor);
        
    }

    public Livros() {
    }
   
    
    //m[etodos gets e sets

    public int getIdLivro() {
        return idLivro;
    }

    public void setIdLivro(int idLivro) {
        this.idLivro = idLivro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getCorredor() {
        return corredor;
    }

    public String getPratilheira() {
        return pratilheira;
    }

    public String getSetor() {
        return setor;
    }

    public void setCorredor(String corredor) {
        this.corredor = corredor;
    }

    public void setPratilheira(String pratilheira) {
        this.pratilheira = pratilheira;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }
    
    
    
    
}
