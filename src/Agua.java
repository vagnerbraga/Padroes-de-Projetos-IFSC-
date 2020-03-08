class Agua extends Substancia {

    public Agua(String nome){
        this.nome = nome;
    }

    @Override
    void solidificar() {
        this.estado.solidificar(this);
    }

    @Override
    void fundir() {
        this.estado.fundir(this);
    }

    @Override
    void condensar() {
        this.estado.condencar(this);
    }

    @Override
    void vaporizar() {
        this.estado.vaporizar(this);
    }

    @Override
    void sublimacao() {
        System.out.println("Substancia não aceita esse tipo de mudança");
    }
}
