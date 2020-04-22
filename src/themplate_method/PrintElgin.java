package themplate_method;

class PrintElgin extends Printer {

    static Printer INSTANCE;

    private PrintElgin(){}

    public static Printer getINSTANCE() {
        if(INSTANCE == null){
            INSTANCE = new PrintElgin();
        }
        return INSTANCE;
    }

    @Override
    public void printPrinter() {
        System.out.println("|       Impressora ELGIN        |");
    }

    @Override
    public void addTextRight(String str) {
        System.out.println("|               "+str+"|");
    }

    @Override
    public void addTextLeft(String str) {
        System.out.println("|"+str+"               |");
    }

    @Override
    public void addTextCenter(String str) {
        System.out.println("|        "+str+"    |");
    }
}
