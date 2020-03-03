public class Principal {

    public static void main(String[] args){

        Orcamento orcamento = new Orcamento();

        orcamento.addUser(new User("cliente"));
        orcamento.addUser(new User("vendedor"));
        orcamento.aprovar();

        orcamento.addUser(new User("Gerente"));
        //orcamento.myNotify();

        orcamento.finalizar();
    }


}