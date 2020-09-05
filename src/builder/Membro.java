package builder;

class Membro {
    String nome;

    public Membro(String nome) {
        this.nome = nome;
    }

    public void descricaoMembro(){
        System.out.println("membro: "+ nome);
    }
    @Override
    public String toString() {
        this.descricaoMembro();
        return "";
    }
}
