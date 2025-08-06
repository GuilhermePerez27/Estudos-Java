package ProdutoAddRemoveValorETotal;
public class Produto {
    private String nome;
    private double preco;
    private int quantidade;


    public double totalValorEstoque() {
        return getPreco() * getQuantidade();
    }

    public void addProduto(int quantidade) {
        setQuantidade(getQuantidade() + quantidade);
    }

    public void removerProduto(int quantidade) {
        setQuantidade(getQuantidade() - quantidade);
    }
    @Override
    public String toString() {
        return String.format("\nProduto: %s "+
                             "\nPreço: R$ %.2f"+
                             "\nQuantidade: %d"+
                             "\nValor Total em Estoque: R$ %.2f",
                             getNome(), getPreco(), getQuantidade(), totalValorEstoque());
    }



    //===========================================================================================


    //Encapsulamento


    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public String getNome() {
        return nome;
    }
}

