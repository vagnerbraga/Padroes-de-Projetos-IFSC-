public class Principal {

    public void main(String[] args){

        Orcamento orcamento = new Orcamento();

        try {
            orcamento.aprovar();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        try {
            orcamento.aprovar();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        try {
            orcamento.reprovar();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        try {
            orcamento.reprovar();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }


        try {
            orcamento.finalizar();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        try {
            orcamento.finalizar();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }




    }


}
