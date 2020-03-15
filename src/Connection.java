class Connection implements ITrip {
    private final int price;
    private final String name;
    private final ITrip origin;
    private final ITrip destiny;

    public Connection(String name, int mPrice, ITrip mOrigin, ITrip mDestiny){
        this.name = name;
        this.price = mPrice;
        this.origin = mOrigin;
        this.destiny = mDestiny;
    }

    @Override
    public int getPrice() {
        return price + origin.getPrice() + destiny.getPrice();
    }

    @Override
    public String toString() {
        return this.name +"\n\t ->>> Origem: "+ origin + "\n\t ->>> Destino: " + destiny + "\n\t ->>> Total: "+ this.getPrice();
    }
}
