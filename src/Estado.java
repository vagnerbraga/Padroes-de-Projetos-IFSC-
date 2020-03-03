public interface Estado {
    String getEstado();
    Estado aprovar();
    Estado reprovar();
    Estado finalizar();
}
