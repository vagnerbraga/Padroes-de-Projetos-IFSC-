abstract class ProductBase {

    private String name;
    private int quantity;
    private int price;

    public ProductBase(String name, int quantity, int price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public void add(String name, int quantity, int price) throws  Exception {
        throw new Exception("Não pode inserir produtos em: "+ this.name + " - Não é um produto tipo Kit");
    }

    public int amount(){
        return this.quantity * this.price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void print(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return this.name + "\t\t"+ this.quantity + "\t\t"+ this.price + "\t\t" + this.amount();
    }
}