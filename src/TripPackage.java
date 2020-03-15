class TripPackage {

    private final String name;
    private final ITrip trip;

    TripPackage(String name, ITrip mTrip) {
        this.name = name;
        this.trip = mTrip;
    }

    @Override
    public String toString() {
        return "Pacote: "+ name + "\n trajeto: " + trip;
    }
}
