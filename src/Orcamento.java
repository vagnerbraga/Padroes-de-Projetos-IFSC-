import java.util.ArrayList;
import java.util.List;

public class Orcamento {
    private EstadoImpl estado;
    private String name;
    private List<Observer> users;

    public Orcamento() {
        this.estado = new EmAndamento();
        this.users = new ArrayList<>();
    }

    public void addUser(Observer observer){
        this.users.add(observer);
    }

    public void aprovar() {
        this.estado = estado.aprovar();
        this.estado.setChangeState(this.users);
    }

    public void reprovar(){

        this.estado = estado.reprovar();
        this.estado.setChangeState(this.users);
    }

    public void finalizar(){

        this.estado = estado.finalizar();
        this.estado.setChangeState(this.users);
    }

    public String getEstado() {
        return estado.getEstado();
    }
}
