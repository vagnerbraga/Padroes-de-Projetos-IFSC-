class ImpostoBuild {


    private Orcamento orcamento;
    private int diasParaPagamento;

    public ImpostoBuild criarImposto(){
        return this;
    }

    public ImpostoBuild comOrcamento(Orcamento orcamento){
        this.orcamento = orcamento;
        return this;
    }

    public ImpostoBuild comXDiasParaPagamento(int dia){
        this.diasParaPagamento = dia;
        return this;
    }

    public ImpostoAbstrato doTipoX(){
        return ImpostoX.getIntance(this.orcamento);
    }
    public ImpostoAbstrato doTipoY(){
        return ImpostoY.getIntance(this.orcamento);
    }
    public ImpostoAbstrato doTipoZ(){
        return ImpostoZ.getIntance(this.orcamento, this.diasParaPagamento);
    }

}
