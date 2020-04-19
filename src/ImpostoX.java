class ImpostoX extends ImpostoAbstrato{

    private static ImpostoX INSTANCE;

    double valor = 0.10;

    private ImpostoX(Orcamento orcamento) {
        super(orcamento);
    }

    public static ImpostoAbstrato getIntance(Orcamento orcamento){
        if(INSTANCE == null){
            INSTANCE = new ImpostoX(orcamento);
        }
        return INSTANCE;
    }



    @Override
    void aplicar() {
        double imposto = 0;
        if (orcamento.valor > 100) {
            imposto = orcamento.valor * valor;
        } else {
            imposto = orcamento.valor * 0.20;
        }
        System.out.println("Imposto X aplicado, Valor: " + (orcamento.valor + imposto) + " imposto: " + imposto);
    }
}