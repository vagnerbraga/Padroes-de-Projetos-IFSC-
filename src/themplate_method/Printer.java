package themplate_method;

abstract class Printer {


    public final void print(){
        this.addTextCenter("                 ");
        this.printPrinter();
        this.addTextRight("Texto na direita");
        this.addTextLeft("Texto na esqueda");
        this.addTextCenter("Texto no add centro");
    }
    
    abstract void printPrinter();
    abstract void addTextRight(String str);
    abstract void addTextLeft(String str);
    abstract void addTextCenter(String str);
}
