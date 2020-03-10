import scholl.Curse;
import scholl.Discipline;
import scholl.Module;

public class Principal {

    public static void main(String[] args){

        Curse c = new Curse("ADS");

        Module m1 = new scholl.Module("Programação");

        Discipline d1 = new Discipline("Proogr 01", 50);
        m1.add(d1);

        Discipline d2 = new Discipline("Proogr 02", 70);
        m1.add(d2);

        c.add(m1);

        System.out.println("Carga horaria curso: "+ c.getTotalHours());

        System.out.println("Curso concluido: "+ c.isConcluid());

        d1.setConcluid(true);
        d2.setConcluid(false);

        System.out.println("Curso concluido: "+ c.isConcluid());

    }


}