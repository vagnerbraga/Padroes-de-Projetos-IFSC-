class TripPackage {

    private final String name;
    private final ITrip trip;

    TripPackage(String name, ITrip trip) {
        this.name = name;
        this.trip = trip;
    }

    void price(){
        System.out.println(trip.getPrice());
    }

    @Override
    public String toString() {
        return "Pacote: "+ name + "\n trajeto: " + trip;
    }
}
