public class EmAndamento implements Estado {

    @Override
    public Estado emAndamento() {
        throw  new RuntimeException("Já estou em andamento");
    }

    @Override
    public Estado aprovar() {
        return new Aprovado();
    }

    @Override
    public Estado reprovar() {
        return new Reprovado();
    }

    @Override
    public Estado finalizar() {
        throw new RuntimeException("Estou em andamento");
    }
}
