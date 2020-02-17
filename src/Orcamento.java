public class Orcamento {

    private Estado estado;

    public Orcamento() {
        this.estado = new EmAndamento();
    }

    public void emAndamento() {
        this.estado = estado.emAndamento();
    }

    public void aprovar() {
        this.estado = estado.aprovar();
    }

    public void reprovar() {
        this.estado = estado.reprovar();
    }

    public void finalizar() {
        this.estado = estado.finalizar();
    }
}
