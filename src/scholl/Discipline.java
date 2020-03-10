package scholl;

public class Discipline implements Training {

    private int totalHours;
    private String name;
    private boolean isconcluid = false;

    public Discipline(String name, int totalHours){
        this.name = name;
        this.totalHours = totalHours;
    }

    @Override
    public int getTotalHours() {
        return totalHours;
    }

    public void setConcluid(boolean concluid) {
        isconcluid = concluid;
    }

    @Override
    public boolean isConcluid() {
        return isconcluid;
    }
}
