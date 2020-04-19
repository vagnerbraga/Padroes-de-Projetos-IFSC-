class ImpostoY extends ImpostoAbstrato {

    private static ImpostoY INSTANCE;
    double valor = 0.20;

    private ImpostoY(Orcamento orcamento) {
        super(orcamento);
    }

    public static ImpostoAbstrato getIntance(Orcamento orcamento){
        if(INSTANCE == null){
            INSTANCE = new ImpostoY(orcamento);
        }
        return INSTANCE;
    }

    @Override
    void aplicar(){
        double imposto = 0;

        if(orcamento.valor > 50){
            imposto = orcamento.valor * valor;
        }else{
            imposto = orcamento.valor * 0.30;
        }

        System.out.println("Imposto Y aplicado, Valor: " + (orcamento.valor + imposto) + " imposto: " + imposto);

    }
}
