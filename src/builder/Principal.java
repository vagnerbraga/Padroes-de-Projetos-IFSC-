package builder;

class Principal {

    public static void main(String[] args) {
        HumanoBuilder
                .prepararCriacaoDeHumano()
                .criarHumano("Vagner")
                .criarMembro("Mão")
                .adicionaMembroAoCorpo()
                .criarMembroDecoradorNaCor("Braço", "Amarela")
                .adicionaMembroAoCorpo()
                .criarMembroDecoradorNaCor("Perna", "Azul")
                .adicionaMembroAoCorpo()
                .criarMembroDecoradorNaCor("Dedo", "Roxa")
                .adicionaMembroAoCorpo()
                .constroi()
                .checkList();
    }
}
