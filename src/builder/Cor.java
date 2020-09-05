package builder;

class Cor extends DecoradorMembro {

    public Cor(String nome, String valor) {
        super(nome, "Cor", valor);

    }
    @Override
    public void detalhes() {
        System.out.println(" decorado com: Tipo: "+ this.tipo + " valor: "+ this.valor);
    }
}
