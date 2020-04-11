import java.util.ArrayList;
import java.util.List;

class PedidoBuilder {

    List<ItemdoPedido> itemdoPedidos;
    Produto produto;
    int quantidade;

    public PedidoBuilder listaDeItens() {
        this.itemdoPedidos = new ArrayList<>();
        return this;
    }

    public PedidoBuilder adicionar(){
        return this;
    }

    public PedidoBuilder oProduto(Produto produto){
        this.produto = produto;
        return this;
    }

    public Pedido constroiPedido(){
        return new Pedido(this.itemdoPedidos);
    }

    public PedidoBuilder comQuantidade(int quantidade) {
        this.quantidade = quantidade;
        return this;
    }

    public PedidoBuilder naLista() {
        this.itemdoPedidos.add(new ItemdoPedido(this.produto, this.quantidade));
        return this;
    }

    public PedidoBuilder constroiListaDeItens() {
        return this;
    }
}
