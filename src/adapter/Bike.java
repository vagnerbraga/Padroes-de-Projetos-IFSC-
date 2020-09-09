package adapter;

class Bike {
    public IBikeTwoWheel twoWheel;

    Bike(IBikeTwoWheel twoWheel){
        this.twoWheel = twoWheel;
    }
    public void ride(){
        this.twoWheel.rideBike();
    }

    public void adapterBike(IBikeTwoWheel threeWheel){
        this.twoWheel = threeWheel;
    }
}
