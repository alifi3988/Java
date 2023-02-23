package classes;

public final class Leitor {
    
    //atributos dos Leitores
    private int    id_leitor;
    private int    id_usuario;
    private String nome;
    private String dataNascimento;
    private String cpf;
    private String rg;
    private String sexo;
    private String cep;
    private String bairro;
    private String complemento;
    private String endereco;
    private String numero;
    private String estado;
    private String telefone;

    
    //métodos
    public Leitor() {
        setId_leitor(0);
        setId_usuario(0);
        setNome(null);
        setDataNascimento(null);
        setCpf(null);
        setRg(null);
        setSexo(null);
        setCep(null);
        setBairro(null);
        setComplemento(null);
        setEndereco(null);
        setNumero(null);
        setEstado(null);
        setTelefone(null);
    }

    public Leitor(int id_leitor, int id_usuario, String nome, String dataNascimento, String cpf, String rg, String sexo, String cep, String bairro, String complemento, String endereco, String numero, String estado, String telefone) {
        
        setId_leitor(id_leitor);
        setId_usuario(id_usuario);
        setNome(nome);
        setDataNascimento(dataNascimento);
        setCpf(cpf);
        setRg(rg);
        setSexo(sexo);
        setCep(cep);
        setBairro(bairro);
        setComplemento(complemento);
        setEndereco(endereco);
        setNumero(numero);
        setEstado(estado);
        setTelefone(telefone);
        
    }

    public void zerarLeitor() {
        
        setId_leitor(0);
        setId_usuario(0);
        setNome(null);
        setDataNascimento(null);
        setCpf(null);
        setRg(null);
        setSexo(null);
        setCep(null);
        setBairro(null);
        setComplemento(null);
        setEndereco(null);
        setNumero(null);
        setEstado(null);
        setTelefone(null);
    }

    //métodos GETS e SETS   

    public int getId_leitor() {
        return id_leitor;
    }

    public void setId_leitor(int id_leitor) {
        this.id_leitor = id_leitor;
    }
    
    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    public boolean adicionarLeitor(int id_leitor, String nome, String dataNascimento, String cpf, 
            String rg, String sexo, String cep, String bairro, String complemento,
            String endereco, String numero, String estado, String telefone){
        try{
            setId_leitor(id_leitor);
            setNome(nome);
            setDataNascimento(dataNascimento);
            setCpf(cpf);
            setRg(rg);
            setSexo(sexo);
            setCep(cep);
            setBairro(bairro);
            setComplemento(complemento);
            setEndereco(endereco);
            setNumero(numero);
            setEstado(estado);
            setTelefone(telefone);
            
        }catch(Exception e){
            System.out.println("Erro de inserção: " + e.getMessage());
            return false;
        }
        
        System.out.println("Daodos inseridos com sucesso!");
        return true;
    }

    @Override
    public String toString() {
        
        String leitor = id_leitor +
                "," + id_usuario +
                "," + nome + 
                "," + dataNascimento + 
                "," + cpf + 
                "," + rg + 
                "," + sexo + 
                "," + cep + 
                "," + bairro + 
                "," + complemento +
                "," + endereco + 
                "," + numero +
                "," + estado + 
                "," + telefone;
        
        return leitor;
    }
}
