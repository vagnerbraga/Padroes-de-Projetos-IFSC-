public class Principal {

    public static void main(String[] args){

        Orcamento orcamento = new Orcamento();

        orcamento.addUser(new User("Vagner - Solicitante"));
        orcamento.addUser(new User("Vagner - vendedor"));
        orcamento.aprovar();
        System.out.println(orcamento.getEstado());
    }


}