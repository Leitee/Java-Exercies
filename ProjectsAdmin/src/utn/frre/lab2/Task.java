package utn.frre.lab2;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Task extends TaskGroup {

    private List<Resource> resources;

    public void addResources(Resource resource) {
        this.resources.add(resource);
    }
    public List<Resource> getResources() {
        return resources;
    }

    public Task(int id, String name, Date startDate, List<Resource> resources) {
        super(id, name, startDate);
        this.resources = resources == null ? new ArrayList<Resource>() : resources;
    }

    @Override
    public float getCost() {
        float cost = 0;
        for (Resource r : resources) {
            cost += r.getCost();
        }
        return cost;
    }

    @Override
    public Period getDuration() {
        return Period.between(
                LocalDate.ofEpochDay(getStartDate().getTime()),
                LocalDate.ofEpochDay(getEndDate().getTime())
        );
    }

    @Override
    public void closeTask(Date endDate) {
        this.progress = 100;
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return startDate +
                "<" + name +
                ", progress=" + progress + "%" +
                ", resources=" + resources.size() +
                ", cost=" + this.getCost() +
                ">";
    }
}
