public class Principal {

    public static void main(String[] args){

        Document document = new Document();

        document.connect();
        document.print();
        document.setPrinter(new PrintElgin());

        document.connect();
        document.print();
        document.disconnect();

        System.out.println("\n");

        document.setPrinter(new PrintHP());
        document.connect();
        document.print();
        document.disconnect();

    }
}