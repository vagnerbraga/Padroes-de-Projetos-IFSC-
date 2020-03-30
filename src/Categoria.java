import java.util.ArrayList;
import java.util.List;

class Categoria implements ICategoria {

    private List<Produto> list = new ArrayList<>();
    private List<ICategoria> listCategoria = new ArrayList<>();
    private String nome;
    public Categoria(String nome) {
        this.nome = nome;
    }

    @Override
    public void addProduto(Produto produto) {
        list.add(produto);
    }

    @Override
    public void adicionar(ICategoria categoria) {
        listCategoria.add(categoria);
    }

    @Override
    public int getTotal() {
        return list.size()  + listCategoria.stream().mapToInt(ICategoria::getTotal).sum();
    }

    @Override
    public void relatorio() {
        System.out.println(list.size()+ (listCategoria.stream().mapToInt(ICategoria::getTotal)).sum() + " - " + this.nome);
        listCategoria.forEach(ICategoria::relatorio);
    }
}
