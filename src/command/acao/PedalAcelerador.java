package command.acao;

import command.comando.Comando;

public class PedalAcelerador implements Acao {

    Comando comando;
    public PedalAcelerador(Comando comando){
        this.comando = comando;
    }
    @Override
    public void executar() {
        System.out.println("Acelerador acionado");
        this.comando.executarComando();
    }
}
