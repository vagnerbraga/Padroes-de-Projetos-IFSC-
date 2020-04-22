package themplate_method;

class PrintHP extends Printer {

    static Printer INSTANCE;

    private PrintHP(){}

    public static Printer getINSTANCE() {
        if(INSTANCE == null){
            INSTANCE = new PrintHP();
        }
        return INSTANCE;
    }

    @Override
    public void printPrinter() {
        System.out.println("|\t\tImpressora HP\t\t\t|");
    }

    @Override
    public void addTextRight(String str) {
        System.out.println("|\t\t\t\t"+str+"|");
    }

    @Override
    public void addTextLeft(String str) {
        System.out.println("|"+str+"\t\t\t\t|");
    }

    @Override
    public void addTextCenter(String str) {
        System.out.println("|\t\t"+str+"\t\t|");
    }

}
