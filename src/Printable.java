abstract class Printable {

    protected Printer printer;
    protected StatusConnection connection;

    public Printable(){
        this.connection = new NullConnectionObject();
        this.printer = new NullPrinterObject();
    }

    public void setPrinter(Printer printer) {
        this.printer = printer;
        this.connection = new Disconnected();
    }

    public void connect(){
        this.connection.connect(this);
    }

    public void disconnect(){
        this.connection.disconnect(this);
    }

    public void setConnection(StatusConnection connection) {
        this.connection = connection;
    }

    public boolean isConnected(){
        return this.connection.onLine();
    }
}
