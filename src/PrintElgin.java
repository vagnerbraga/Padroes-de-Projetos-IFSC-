class PrintElgin implements Printer {
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
