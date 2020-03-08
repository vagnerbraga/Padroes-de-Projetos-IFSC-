class Solido implements Estado {

    @Override
    public void solidificar(Substancia substancia) {
        throw new RuntimeException("Solido já esta no estado de solido");
    }

    @Override
    public void fundir(Substancia substancia) {
        substancia.setEstado(new Liquido());
    }

    @Override
    public void vaporizar(Substancia substancia) {
        throw new RuntimeException("Solido não entra no estado de vapor");
    }

    @Override
    public void sublimar(Substancia substancia) {
        substancia.setEstado(new Gasoso());
    }

    @Override
    public void condencar(Substancia substancia) {
        throw new RuntimeException("Solido não entra no estado de condesação");
    }

    @Override
    public String toString() {
        return "estado: Solido";
    }
}
