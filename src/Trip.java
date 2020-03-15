
class Trip implements ITrip {

    private final String name;
    private final int price;

    public Trip(String mName, int mPrice){
        this.name = mName;
        this.price = mPrice;
    }

    @Override
    public int getPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        return "Nome: "+this.name + " Total: " + this.getPrice();
    }
}
