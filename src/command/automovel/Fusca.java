package command.automovel;

public class Fusca implements Automovel {
    @Override
    public void acelerar() {
        System.out.println("Fusca acelerando");
    }

    @Override
    public void ligar() {
        System.out.println("Fusca ligado");
    }

    @Override
    public void desligar() {
        System.out.println("Fusca desligado");
    }
}
