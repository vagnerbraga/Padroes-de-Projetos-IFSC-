package prova_questao_8;

class Lampada implements IObjeto {
    private boolean estado = false;
    public void ligarDesligar(){
        this.estado = !this.estado;
    }

    public void estaLigada(){
        System.out.println("Estado: "+ (estado ? "ligada" : "desligada"));
    }
}
