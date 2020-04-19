class ImpostoZ extends ImpostoAbstrato{

    private static ImpostoAbstrato INSTANCE;
    double valor = 0.10;
    final double diasParaPagamento;

    public ImpostoZ(Orcamento orcamento, double diasParaPagamento) {
        super(orcamento);
        this.diasParaPagamento = diasParaPagamento;
    }

    public static ImpostoAbstrato getIntance(Orcamento orcamento, int diasParaPagamento){
        if(INSTANCE == null){
            INSTANCE = new ImpostoZ(orcamento, diasParaPagamento);
        }
        return INSTANCE;
    }

    @Override
    void aplicar(){
        double imposto = 0;
        if(imposto > 50){
            imposto = orcamento.valor * valor;
        }else{
            imposto = (orcamento.valor * 0.01) * diasParaPagamento ;
        }
        System.out.println("Imposto Z aplicado, Valor: " + (orcamento.valor + imposto) + " imposto: " + imposto);
    }
}
