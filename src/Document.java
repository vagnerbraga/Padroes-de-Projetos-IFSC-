class Document extends Printable {

    public void print(){
        if(this.isConnected()){
            this.printer.addTextCenter("                 ");
            this.printer.printPrinter();
            this.printer.addTextRight("Texto na direita");
            this.printer.addTextLeft("Texto na esqueda");
            this.printer.addTextCenter("Texto no add centro");
        }else{
            System.out.println(this.connection.status());
        }
    }
}
