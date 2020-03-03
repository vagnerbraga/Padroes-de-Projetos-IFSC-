import java.util.List;

interface Observable {

    void addUser(Observer observer);

    void remove(Observer observer);

    void myNotify();

}
