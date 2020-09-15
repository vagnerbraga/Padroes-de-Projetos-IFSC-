package prova_questao_8;

class Teste {

    public static void main(String[] args) {

        IObjeto objeto = new Lampada();

        Comando comando = new Voz(objeto);

        Acao acao = new LigarDesligar(comando);

        acao.executar();
        acao.executar();
        objeto.estaLigada();


    }
}
