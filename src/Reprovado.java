public class Reprovado extends EstadoImpl {
    @Override
    public String getEstado() {
        return "Reprovado";
    }
    @Override
    public EstadoImpl aprovar() {
        throw new RuntimeException("nao da");
    }

    @Override
    public EstadoImpl reprovar() {
        throw new RuntimeException("nao da");
    }

    @Override
    public EstadoImpl finalizar() {
        return new Finalizado();
    }

    @Override
    public String getLabel() {
        return "Reprovado";
    }
}
