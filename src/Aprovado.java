public class Aprovado implements Estado {
    @Override
    public String getEstado() {
        return "Aprovado";
    }

    @Override
    public Estado aprovar() {
        throw new RuntimeException("nao da");
    }

    @Override
    public Estado reprovar() {
        throw new RuntimeException("nao da");
    }

    @Override
    public Estado finalizar() {
        return new Finalizado();
    }

}
