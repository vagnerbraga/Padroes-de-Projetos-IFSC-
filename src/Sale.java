import java.util.ArrayList;
import java.util.List;

class Sale {
    private List<ProductBase> itens = new ArrayList<>();

    public void add(ProductBase productBase){
        this.itens.add(productBase);
    }

    public void print(){
        itens.forEach(item->item.print());
    }

    public void amount(){
        int total = this.itens.stream().mapToInt(ProductBase::amount).sum();
        System.out.println("Total\t\t\t\t\t\t"+ total);
    }
}
