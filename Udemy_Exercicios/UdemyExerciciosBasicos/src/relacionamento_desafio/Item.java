package relacionamento_desafio;

public class Item {
    
    private int qtd;
    Produto produto = new Produto();

    public int getQtd() {
        return this.qtd;
    }
    public void setQtd(int qtd) {
        this.qtd = qtd;
    }
    
    public void Quantidade(int qtd){
        setQtd(qtd);
    }
    
    Item(String nome, double preco, int quantidade){
        produto.setNome(nome);
        produto.setPreco(preco);
        Quantidade(quantidade);
    }
    
    void Limpar(){
        produto.setNome("");
        produto.setPreco(0.0);
        setQtd(0);
    }
}
