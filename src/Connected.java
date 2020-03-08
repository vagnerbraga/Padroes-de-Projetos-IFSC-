class Connected implements StatusConnection {
    @Override
    public boolean onLine() {
        return true;
    }

    @Override
    public void connect(Printable printable) {
        System.out.println("Conectado");
    }

    @Override
    public void disconnect(Printable printable) {
        printable.setConnection(new Disconnected());
    }

    @Override
    public String status() {
        return "Conectado";
    }
}
