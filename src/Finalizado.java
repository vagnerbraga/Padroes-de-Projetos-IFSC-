public class Finalizado implements Estado {
    @Override
    public Estado emAndamento() {
        throw new RuntimeException("Estou Finalizado");
    }

    @Override
    public Estado aprovar() {
        throw new RuntimeException("Estou Finalizado");
    }

    @Override
    public Estado reprovar() {
        throw new RuntimeException("Estou Finalizado");
    }

    @Override
    public Estado finalizar() {
        throw new RuntimeException("Estou Finalizado");
    }
}
