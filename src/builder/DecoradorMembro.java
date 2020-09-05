package builder;

abstract class DecoradorMembro extends Membro {

    //protected Membro membro;
    protected String tipo;
    protected String valor;

    public DecoradorMembro(String nomeMembro, String tipo, String valor) {
        super(nomeMembro);
        this.tipo = tipo;
        this.valor = valor;
    }
    public abstract void detalhes();
    @Override
    public void descricaoMembro() {
        super.descricaoMembro();
        this.detalhes();
    }
    @Override
    public String toString() {
        this.descricaoMembro();
        return "";
    }
}
