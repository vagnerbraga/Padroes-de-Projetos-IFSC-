import java.util.List;

class Fechado implements Estado{
    @Override
    public void adicionar(List<Item> list, Item item) {
        throw new RuntimeException("Pedido fechado");
    }

    @Override
    public void remover(List<Item> list, Item item) {
        throw new RuntimeException("Pedido fechado");
    }

    @Override
    public Estado fechar() {
        throw new RuntimeException("Pedido já está fechado");
    }

    @Override
    public Estado reabrir() {
        return new Aberto();
    }
}
