import java.util.ArrayList;
import java.util.List;

public class Orcamento implements Observable {
    private Estado estado;
    private String name;
    private List<Observer> users;

    public Orcamento() {
        this.estado = new EmAndamento();
        this.users = new ArrayList<>();
    }

    public void addUser(Observer observer){
        this.users.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        this.users.remove(observer);
    }

    @Override
    public void myNotify() {
        this.users.forEach(item->item.update("Seu orçamento foi: " + this.getEstado()));
    }

    public void aprovar() {
        this.setEstado(estado.aprovar());
    }

    public void reprovar(){
        this.setEstado(estado.reprovar());
    }

    public void finalizar(){
        this.setEstado(estado.finalizar());
    }

    void setEstado(Estado estado){
        this.estado = estado;
        this.myNotify();
    }

    public String getEstado() {
        return estado.getEstado();
    }
}
