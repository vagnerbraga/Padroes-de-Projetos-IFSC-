package command.automovel;

public class Trator implements Automovel {
    @Override
    public void acelerar() {
        System.out.println("Trator acelerando");
    }

    @Override
    public void ligar() {
        System.out.println("Trator ligado");
    }

    @Override
    public void desligar() {
        System.out.println("Trator desligado");
    }
}
