class Naftalina extends Substancia {

    public Naftalina(String nome){
        this.setNome(nome);
    }
    @Override
    void solidificar() {
        System.out.println("Substancia não aceita esse tipo de mudança");
    }

    @Override
    void fundir() {
        System.out.println("Substancia não aceita esse tipo de mudança");
    }

    @Override
    void condensar() {
        System.out.println("Substancia não aceita esse tipo de mudança");
    }

    @Override
    void vaporizar() {
        System.out.println("Substancia não aceita esse tipo de mudança");
    }

    @Override
    void sublimacao() {
        this.estado.sublimar(this);
    }
}
