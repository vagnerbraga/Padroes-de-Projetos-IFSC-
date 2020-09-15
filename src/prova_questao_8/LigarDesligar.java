package prova_questao_8;

class LigarDesligar implements Acao {
    Comando comando;

    public LigarDesligar(Comando comando) {
        this.comando = comando;
    }

    @Override
    public void executar() {
        this.comando.executarComando();
    }
}
