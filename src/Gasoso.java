class Gasoso implements Estado {
    @Override
    public void solidificar(Substancia substancia) {
        throw new RuntimeException("Gasoso não solidifica");
    }

    @Override
    public void fundir(Substancia substancia) {
        throw new RuntimeException("Gasoso não entra no estado de fusao");
    }

    @Override
    public void vaporizar(Substancia substancia) {
        throw new RuntimeException("Gasoso já esta vaporizado");
    }

    @Override
    public void sublimar(Substancia substancia) {
        substancia.setEstado(new Solido());
    }

    @Override
    public void condencar(Substancia substancia) {
        substancia.setEstado(new Liquido());
    }

    @Override
    public String toString() {
        return "estado: Gasoso";
    }
}
