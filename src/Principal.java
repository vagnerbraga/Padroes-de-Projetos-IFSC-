public class Principal {

    public static void main(String[] args){

        Group g = Group.newGroup("Nois");

        g.add(new User("Vagner"));
        g.add(new User("Zé coméia"));
        g.add(new User("Zeca piolho"));

        g.sendMsg("bem vindo ao grupo seus cambada de coxa colad");

        g.myNotify();
    }


}