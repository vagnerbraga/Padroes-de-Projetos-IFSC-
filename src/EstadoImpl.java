import java.util.List;

abstract class EstadoImpl implements Estado  {

    protected void setChangeState(List<Observer> users){
        users.forEach(item->item.update("Seu orçamento foi: " + this.getLabel()));
    }

}
