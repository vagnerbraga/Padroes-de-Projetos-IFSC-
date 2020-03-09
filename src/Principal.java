public class Principal {

    public static void main(String[] args){

        System.out.println("Problema de item do tipo produto e produto kit");

        Sale sale = new Sale();

        sale.add(new Product("Item 01", 10, 2));
        sale.add(new Product("Item 02", 3, 1));
        sale.add(new Product("Item 01", 5, 6));

        ProductBase kit = new ProductKit("Kit cesta basica");

        try {
            kit.add("Arroz", 2, 5);
            kit.add("Acucar", 1, 5);
            kit.add("Feijao", 4, 8);
            kit.add("Farinha", 1, 2);
            kit.add("Óleo", 1, 1);
        } catch (Exception e) {
            e.printStackTrace();
        }

        sale.add(kit);

        sale.print();

        sale.amount();

    }
}