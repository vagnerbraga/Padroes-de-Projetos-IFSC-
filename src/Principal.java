public class Principal {

    public static void main(String[] args){
        ICategoria geral = new Categoria("Geral");

        ICategoria eletrodomesticos = new Categoria("Eletrodomésticos");
        geral.adicionar(eletrodomesticos);

        ICategoria eletroeletronicos = new Categoria("Eletroeletronicos");
        geral.adicionar(eletroeletronicos);

        ICategoria geladeiras_e_freezers = new Categoria("Geladeiras e Freezers");
        eletrodomesticos.adicionar(geladeiras_e_freezers);

        ICategoria geladeiras = new Categoria("Geladeiras");
        geladeiras_e_freezers.adicionar(geladeiras);

        ICategoria inox = new Categoria("Inox");
        geladeiras.adicionar(inox);

        ICategoria branca = new Categoria("Branca");
        geladeiras.adicionar(branca);

        new Produto("Brastemp BT3456", 10, inox);
        new Produto("Eletrolux EL1234", 10, branca);
        new Produto("TV Sansung UX1234", 10, eletroeletronicos);

        geral.relatorio();
        System.out.println("----------------------");
        geladeiras.relatorio();
    }


}