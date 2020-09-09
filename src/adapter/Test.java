package adapter;

class Test {

    public static void main(String[] args) {
        Bike bike = new Bike(new BikeTwoWheel());
        bike.ride();

        bike.adapterBike(new BikeAdapterToThreeWheel());
        bike.ride();
    }
}
