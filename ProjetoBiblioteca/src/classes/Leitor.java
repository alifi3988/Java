package classes;



public final class Leitor {
    
    //atributos dos Leitores
    private String  nome;
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

    public Leitor(String nome, String dataNascimento, String cpf, String rg, String sexo, String cep, String bairro, String complemento, String endereco, String numero, String estado, String telefone) {
        
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
    
    public boolean adicionarLeitor(String nome, String dataNascimento, String cpf, 
            String rg, String sexo, String cep, String bairro, String complemento,
            String endereco, String numero, String estado, String telefone){
        try{
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
        
        String leitor = nome + 
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
