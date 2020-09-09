package command.acao;

import command.comando.Comando;

public class ChaveDesligar implements Acao {

    Comando comando;
    public ChaveDesligar(Comando comando){
        this.comando = comando;
    }
    @Override
    public void executar() {
        System.out.println("Chace Desligar acionado");
        this.comando.executarComando();
    }
}
