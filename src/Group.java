import java.util.ArrayList;
import java.util.List;

public class Group implements Observable {


    private final String name;
    private final List<Observer> users;
    private String lastMsg;

    private Group(String name){
        this.name = name;
        this.users = new ArrayList<>();
    }

    public static Group newGroup(String name){
        return new Group(name);
    }

    public void sendMsg(String msg){
        this.lastMsg = msg;
    }

    @Override
    public void add(Observer observer) {
        this.users.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        this.users.remove(observer);
    }

    @Override
    public void myNotify() {
        this.users.forEach(item -> item.update(this.lastMsg));
    }
}
