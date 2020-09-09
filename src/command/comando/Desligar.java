package command.comando;

import command.automovel.Automovel;

class Desligar implements Comando {
    Automovel automovel;
    public Desligar(Automovel automovel){
        this.automovel = automovel;
    }
    @Override
    public void executarComando() {
        System.out.println("Comando desligar executado");
        this.automovel.desligar();
    }
}
