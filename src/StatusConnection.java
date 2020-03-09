interface StatusConnection {

    boolean onLine();
    void connect(Printable printable);
    void disconnect(Printable printable);
    String status();
}
