import java.util.List;

interface Estado {

    void adicionar(List<Item> list, Item item);
    void remover(List<Item> list, Item item);
    Estado fechar();
    Estado reabrir();

}
