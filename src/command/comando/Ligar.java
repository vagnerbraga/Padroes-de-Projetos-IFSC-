package command.comando;

import command.automovel.Automovel;

public class Ligar implements Comando {
    Automovel automovel;
    public Ligar(Automovel automovel){
        this.automovel = automovel;
    }
    @Override
    public void executarComando() {
        this.automovel.ligar();
    }
}
