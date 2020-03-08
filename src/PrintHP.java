class PrintHP implements Printer {
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
