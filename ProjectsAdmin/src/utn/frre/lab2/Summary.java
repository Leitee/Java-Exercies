package utn.frre.lab2;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class Summary extends TaskGroup {

    public Summary(int id, String name, Task firstTask) {
        super(id, name, firstTask.startDate);
        this.nextTask = firstTask;
    }

    @Override
    public float getCost() {
        float cost = 0;
        TaskBase t = nextTask;
        while (t.hasNextTask()) {
            cost += t.getCost();
        }

        return cost;
    }

    @Override
    public Period getDuration() {
        Period dur;
        TaskBase t = nextTask;
        Date startDateAux = t.startDate;
        while (t.hasNextTask()) {
            t = t.nextTask;
        }
        return Period.between(
                LocalDate.ofEpochDay(startDateAux.getTime()),
                LocalDate.ofEpochDay(t.endDate.getTime()));
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        TaskBase temp = this.nextTask;
        while (temp.hasNextTask()) {
            sb.append(temp.toString());
            temp = nextTask.getNextTask();
        }
        return sb.toString();
    }
}
