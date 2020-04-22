package themplate_method;

public class Principal {

    public static void main(String[] args){

        Printer printer = PrintHP.getINSTANCE();

        printer.print();

        printer = PrintElgin.getINSTANCE();

        printer.print();

    }
}