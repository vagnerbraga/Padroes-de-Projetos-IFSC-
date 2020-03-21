public class Produto {
    private String nome;
    private float preco;

    public Produto(String nome, float preco) {
        this.nome = nome;
        this.preco = preco;
    }


    public float getPreco() {
        return preco;
    }
    public String getNome(){return this.nome;}
}
