package scholl;

import java.util.ArrayList;
import java.util.List;

public class Module implements Training, Agrouped<Discipline>{

    private String name;
    private List<Discipline>  discipline = new ArrayList<>();

    public Module(String name) {
        this.name = name;
    }

    @Override
    public void add(Discipline discipline){
        this.discipline.add(discipline);
    }

    @Override
    public int getTotalHours() {
        return this.discipline.stream().mapToInt(Training::getTotalHours).sum();
    }

    @Override
    public boolean isConcluid() {
        return this.discipline.stream().filter(Discipline::isConcluid).count() == this.discipline.size();
    }
}
