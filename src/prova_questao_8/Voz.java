package prova_questao_8;

class Voz implements Comando {
    IObjeto objeto;

    public Voz(IObjeto objeto){
        this.objeto = objeto;
    }

    @Override
    public void executarComando() {
        this.objeto.ligarDesligar();
    }
}
