import java.util.ArrayList;
import java.util.List;

class ProductKit extends ProductBase {

    List<ProductBase> products;

    public ProductKit(String name) {
        super(name, 0, 0);
        this.products = new ArrayList<>();
    }

    @Override
    public void add(String name, int quantity, int price) {
        products.add(new Product(name, quantity, price));
    }

    @Override
    public void print() {
        this.products.forEach(item->System.out.println(item));
    }

    @Override
    public int amount() {
        return this.products.stream().mapToInt(ProductBase::amount).sum();

    }
}
