class Produto {
    private String nome;
    private int valor;

    public Produto(String nome, int valor, ICategoria ICategoria) {
        this.nome = nome;
        this.valor = valor;
        ICategoria.addProduto(this);
    }
}
