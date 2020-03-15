public class Principal {

    public static void main(String[] args){

        Trip t1 = new Trip(" São Paulo a Brasília", 500);
        Trip t2 = new Trip(" Brasília a Recife", 300);
        Trip t3 = new Trip(" Recife a Natal", 350);

        Connection c1 = new Connection("C1 - Brasilia -> Natal", 30, t2, t3);

        Connection c2 = new Connection("C1 - São Paulo -> Natal", 50, t1, c1);

        TripPackage tripPackage = new TripPackage("Ferias em Natal ", c1);
        System.out.println(tripPackage);

        TripPackage tripPackage1 = new TripPackage("Ferias em Brasilia ", t1);
        System.out.println(tripPackage1);

        TripPackage tripPackage2 = new TripPackage("Ferias em Natal ", c2);
        System.out.println(tripPackage2);
    }

}