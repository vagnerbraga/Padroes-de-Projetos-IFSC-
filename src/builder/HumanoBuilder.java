package builder;

import java.io.InvalidObjectException;
import java.util.ArrayList;
import java.util.List;

class HumanoBuilder {

    private Humano humano;
    private List<Membro> membros;
    private Membro membro;

    private HumanoBuilder(){}

    public static final HumanoBuilder prepararCriacaoDeHumano(){
        return new HumanoBuilder();
    }

    public HumanoBuilder criarHumano(String nome){
        this.humano = new Humano(nome);
        this.membros = new ArrayList<>();
        return this;
    }

    public HumanoBuilder criarMembro(String nome){
        this.membro = new Membro(nome);
        return this;
    }

    public HumanoBuilder criarMembroDecoradorNaCor(String nomeMembro, String cor){
        this.membro = new Cor(nomeMembro, cor);
        return this;
    }

    public HumanoBuilder adicionaMembroAoCorpo(){
        this.membros.add(this.membro);
        return this;
    }

    public HumanoBuilder constroi(){
        this.humano.membros.clear();
        this.humano.membros.addAll(this.membros);
        return this;
    }

    public HumanoBuilder checkList(){
        this.humano.checkList();
        return this;
    }
}

