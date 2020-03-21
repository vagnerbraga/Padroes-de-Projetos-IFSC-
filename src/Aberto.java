import java.util.List;

class Aberto implements Estado {
    @Override
    public void adicionar(List<Item> list, Item item) {
        System.out.println("Item add: " +  item.getNome());
        list.add(item);
    }

    @Override
    public void remover(List<Item> list, Item item) {
          list.remove(item);
    }

    @Override
    public Estado fechar() {
        return new Fechado();
    }

    @Override
    public Estado reabrir() {
        throw new RuntimeException("Pedido aberto");
    }
}
