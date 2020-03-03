public class EmAndamento extends EstadoImpl {
    @Override
    public String getEstado() {
        return "Em andamento";
    }
    @Override
    public EstadoImpl aprovar() {
        return new Aprovado();
    }

    @Override
    public EstadoImpl reprovar() {
        return new Reprovado();
    }

    @Override
    public EstadoImpl finalizar() {
        throw new RuntimeException("nao da");
    }

    @Override
    public String getLabel() {
        return "Em andamento";
    }
}
