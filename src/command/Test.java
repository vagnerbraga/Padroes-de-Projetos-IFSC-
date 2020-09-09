package command;

import command.acao.Acao;
import command.acao.ChaveDesligar;
import command.acao.PedalAcelerador;
import command.automovel.Automovel;
import command.automovel.Fusca;
import command.automovel.Trator;
import command.comando.Acelerar;
import command.comando.Comando;
import command.comando.Ligar;

class Test {
    public static void main(String[] args) {

        Automovel automovel = new Trator();

        Comando comando = new Acelerar(automovel);

        Acao acao = new ChaveDesligar(comando);

        acao.executar();


    }
}
