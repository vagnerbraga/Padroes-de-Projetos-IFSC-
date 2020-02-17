public class Aprovado implements Estado {
    @Override
    public Estado emAndamento() {
        throw new RuntimeException("Estou aprovado");
    }

    @Override
    public Estado aprovar() {
        throw new RuntimeException("Estou aprovado");
    }

    @Override
    public Estado reprovar() {
        throw new RuntimeException("Estou aprovado");
    }

    @Override
    public Estado finalizar() {
        return new Finalizado();
    }
}
