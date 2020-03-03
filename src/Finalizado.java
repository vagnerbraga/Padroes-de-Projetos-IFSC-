public class Finalizado extends EstadoImpl {
    @Override
    public String getEstado() {
        return "Finalizado";
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
        throw new RuntimeException("nao da");
    }

    @Override
    public String getLabel() {
        return "Finalizado";
    }
}
