package scholl;

import java.util.ArrayList;
import java.util.List;

public class Curse implements Training, Agrouped<Module> {

    private String name;
    private List<Module> modules = new ArrayList<>();

    public Curse(String name) {
        this.name = name;
    }

    @Override
    public void add(Module module) {
        this.modules.add(module);
    }
    @Override
    public int getTotalHours() {
        return modules.stream().mapToInt(Training::getTotalHours).sum();
    }

    @Override
    public boolean isConcluid() {
        return this.modules.stream().filter(Module::isConcluid).count() == this.modules.size();
    }

}
