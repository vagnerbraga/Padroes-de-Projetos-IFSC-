package builder;

import java.util.ArrayList;
import java.util.List;

class Humano {

    List<Membro> membros;
    String nome;

    public Humano(String nome) {
        this.nome = nome;
        this.membros = new ArrayList<>();
    }

    public void checkList(){
        System.out.println("Humano: "+ this.nome);
        membros.forEach(System.out::println);
    }
}
