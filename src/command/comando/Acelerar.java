package command.comando;

import command.automovel.Automovel;

public class Acelerar implements Comando {
    Automovel automovel;

    public Acelerar(Automovel automovel){
        this.automovel = automovel;
    }
    @Override
    public void executarComando() {
        this.automovel.acelerar();
    }
}
