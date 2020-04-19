abstract class ImpostoAbstrato {

    protected Orcamento orcamento;

    public ImpostoAbstrato(Orcamento orcamento) {
        this.orcamento = orcamento;
    }

    abstract void aplicar();
}
