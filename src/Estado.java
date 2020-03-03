public interface Estado {
    String getEstado();
    EstadoImpl aprovar();
    EstadoImpl reprovar();
    EstadoImpl finalizar();

    String getLabel();

}
