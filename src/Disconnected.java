class Disconnected implements StatusConnection {
    @Override
    public boolean onLine() {
        return false;
    }

    @Override
    public void connect(Printable printable) {
        printable.setConnection(new Connected());
    }

    @Override
    public void disconnect(Printable printable) {
        System.out.println("Status desconectado");
    }

    @Override
    public String status() {
        return "Desconectado";
    }
}
