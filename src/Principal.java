public class Principal {

    public static void main(String[] args){
        Substancia naftalina = new Naftalina("Naftalina");

        toStringObject(naftalina);

        naftalina.setEstado(new Solido());

        naftalina.condensar();
        toStringObject(naftalina);

        naftalina.vaporizar();
        toStringObject(naftalina);

        naftalina.fundir();
        toStringObject(naftalina);

        naftalina.sublimacao();
        toStringObject(naftalina);

        naftalina.sublimacao();
        toStringObject(naftalina);

        naftalina.sublimacao();
        toStringObject(naftalina);

        Substancia agua = new Agua("Agua");

        agua.setEstado(new Solido());
        toStringObject(agua);

        agua.fundir();
        toStringObject(agua);

        agua.sublimacao();
        toStringObject(agua);

        agua.vaporizar();
        toStringObject(agua);

    }

    public static void toStringObject(Substancia substancia){
        System.out.println(substancia);
    }
}