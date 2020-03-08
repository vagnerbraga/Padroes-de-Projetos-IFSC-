abstract class Substancia {

    protected Estado estado;
    protected String nome;

    public Substancia(){
        this.estado = new EstadoNull();
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    void setEstado(Estado estado){
        this.estado = estado;
    }

    abstract void solidificar();
    abstract void fundir();
    abstract void condensar();
    abstract void vaporizar();
    abstract void sublimacao();

    @Override
    public String toString() {
        return "Substancia{estado= " + estado + ", nome='" + nome + "}";
    }
}