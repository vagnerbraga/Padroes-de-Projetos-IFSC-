public class Reprovado implements Estado {
    @Override
    public Estado emAndamento() {
        throw new RuntimeException("Estou reprovado");
    }

    @Override
    public Estado aprovar() {
        throw new RuntimeException("Estou reprovado");
    }

    @Override
    public Estado reprovar() {
        throw new RuntimeException("Estou reprovado");
    }

    @Override
    public Estado finalizar() {
        return new Finalizado();
    }
}
