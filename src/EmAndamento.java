public class EmAndamento implements Estado {
    @Override
    public String getEstado() {
        return "Em andamento";
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
        throw new RuntimeException("nao da");
    }

}
