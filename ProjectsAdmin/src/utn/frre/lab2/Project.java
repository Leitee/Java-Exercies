package utn.frre.lab2;

import java.time.Period;

public class Project extends TaskGroup {
    private String description;

    public Project(int id, String name, Summary firstTask) {
        super(id, name, firstTask.startDate);
        this.nextTask = firstTask;
    }

    @Override
    public float getCost() {
        return 0;
    }

    @Override
    public Period getDuration() {
        return null;
    }

    @Override
    public String toString() {
        return description;
    }
}
