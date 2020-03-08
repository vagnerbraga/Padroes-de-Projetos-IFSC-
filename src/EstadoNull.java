class EstadoNull implements Estado {
    @Override
    public void solidificar(Substancia substancia) {
        this.returnException();
    }

    @Override
    public void fundir(Substancia substancia) {
        this.returnException();
    }

    @Override
    public void vaporizar(Substancia substancia) {
        this.returnException();
    }

    @Override
    public void sublimar(Substancia substancia) {
        this.returnException();
    }

    @Override
    public void condencar(Substancia substancia) {
        this.returnException();
    }

    private void returnException(){
        throw new RuntimeException("Sem estado");
    }

    @Override
    public String toString() {
        return "estado: sem estado inicial";
    }
}
