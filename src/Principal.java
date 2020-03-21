public class Principal {

    public static void main(String[] args){
        Produto cerveja = new Produto("Cerveja", 10);
        Produto carne = new Produto("Carne", 30);

        Cliente ze = new Cliente("ze");

        Pedido pedido = new Pedido(ze);

        Item item1 = new Item(2, cerveja);
        Item item2 = new Item(carne);

        pedido.adicionar(item1);

        pedido.fechar();

        try {
            pedido.adicionar(item2);
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println(pedido.total());

    }
}