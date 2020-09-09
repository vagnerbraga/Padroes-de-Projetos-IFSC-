package adapter;

class BikeAdapterToThreeWheel implements IBikeTwoWheel {

    private final BikeThreeWheel bikeThreeWheel;

    BikeAdapterToThreeWheel(){
        this.bikeThreeWheel = new BikeThreeWheel();
    }

    @Override
    public void rideBike() {
        System.out.println("Bike adaptada para anda com três rodas");
        this.bikeThreeWheel.rideThreeWheel();
    }
}
