class NullPrinterObject implements Printer {
    @Override
    public void printPrinter() {
        System.out.println("Sem impressora no momento");
    }

    @Override
    public void addTextRight(String str) {
        this.addMsg();
    }

    @Override
    public void addTextLeft(String str) {
        this.addMsg();
    }

    @Override
    public void addTextCenter(String str) {
        this.addMsg();
    }

    private void addMsg(){
        System.out.println("identifique o tipo de impressora");
    }
}
