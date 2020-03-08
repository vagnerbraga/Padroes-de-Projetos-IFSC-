class NullConnectionObject implements StatusConnection {
    @Override
    public boolean onLine() {
        return false;
    }

    @Override
    public void connect(Printable printable) {
        this.sendMsg();
    }

    @Override
    public void disconnect(Printable printable) {
        this.sendMsg();
    }

    @Override
    public String status() {
        return "Sem impressora";
    }

    private void sendMsg(){
        System.out.println("Sem impressora");
    }
}
