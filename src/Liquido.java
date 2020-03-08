class Liquido implements Estado {
    @Override
    public void solidificar(Substancia substancia) {
        substancia.setEstado(new Solido());
    }

    @Override
    public void fundir(Substancia substancia) {
        throw new RuntimeException("Já está no estaso liquido");
    }

    @Override
    public void vaporizar(Substancia substancia) {
        substancia.setEstado(new Gasoso());
    }

    @Override
    public void sublimar(Substancia substancia) {
        throw new RuntimeException("Liquido não faz sublimação");
    }

    @Override
    public void condencar(Substancia substancia) {
        throw new RuntimeException("Liquido não condensa");
    }

    @Override
    public String toString() {
        return "estado: Liquido";
    }
}
