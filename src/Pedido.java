import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Pedido implements ManipularLista {
    private LocalDate data;
    private Cliente cliente;

    private List<Item> itens;

    private Estado estado;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        this.data = LocalDate.now();
        this.itens = new ArrayList<>();
        this.estado = new Aberto();
    }

    public void adicionar(Item item) {
        this.estado.adicionar(this.itens, item);
    }

    public void remover(Item item) {
        this.estado.remover(this.itens, item);
    }

    public void fechar(){
        estado = this.estado.fechar();
    }

    public void reabrir(){
        estado = this.estado.reabrir();
    }

    public float total() {
        float total = 0;
        for(Item item: itens){
            total= total + item.subTotal();
        }
        return  total;
    }

}