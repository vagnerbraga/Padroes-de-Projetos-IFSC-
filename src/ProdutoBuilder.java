class ProdutoBuilder {
    String nane;
    float price;
    public ProdutoBuilder(String name, float price) {
        this.nane = name;
        this.price = price;
    }
    public Produto constroi(){
        return new Produto(this.nane, this.price);
    }

}
