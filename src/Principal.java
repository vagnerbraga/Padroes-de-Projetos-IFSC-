public class Principal {

    public static void main(String[] args){

        Trip t1 = new Trip(" São Paulo a Brasília", 500);
        Trip t2 = new Trip(" Brasília a Recife", 300);
        Trip t3 = new Trip(" Recife a Natal", 350);

        Connection c1 = new Connection("C1 - Brasilia -> Natal", 30, t2, t3);

        Connection c2 = new Connection("C1 - São Paulo -> Natal", 50, t1, c1);

        TripPackage tripPackage = new TripPackage("Ferias em Natal ", c1);
        show(tripPackage);

        TripPackage tripPackage1 = new TripPackage("Ferias em Brasilia ", t1);
        show(tripPackage1);

        TripPackage tripPackage2 = new TripPackage("Ferias em Natal ", c2);
        show(tripPackage2);

        Customer traveler01 = new Customer("José");
        Customer traveler02 = new Customer("João");
        Customer traveler03 = new Customer("Zé");

        tripPackage.add(traveler01);
        tripPackage.add(traveler02);
        tripPackage.setDiscount(2);

        tripPackage1.add(traveler02);
        tripPackage1.add(traveler03);

        tripPackage1.setDiscount(5);

    }

    private static void show(TripPackage tripPackage) {
        System.out.println(tripPackage);
    }

}