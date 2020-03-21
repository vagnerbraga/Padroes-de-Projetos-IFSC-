import java.util.ArrayList;
import java.util.List;

class TripPackage implements Observable {

    private final String name;
    private final ITrip trip;
    private int discount;
    private final List<Observer> customers = new ArrayList<>();

    TripPackage(String name, ITrip mTrip) {
        this.name = name;
        this.trip = mTrip;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
        this.notifyObservers();
    }

    @Override
    public String toString() {
        return "Pacote: "+ name + "\n trajeto: " + trip;
    }

    @Override
    public void add(Observer observer) {
        this.customers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        this.customers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        this.customers.forEach(item -> item.update("Viagem "+ this.name +" com desconto de: "+ this.discount));
    }
}
