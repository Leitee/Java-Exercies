package utn.frre.lab2;

import java.time.Period;
import java.util.*;

public class Project extends TaskGroup {
    private String description;

    public Project(int id, String name, Summary firstTask) {
        super(id, name, firstTask.startDate);
        this.nextTask = firstTask;
    }

    @Override
    public void closeTask(Date endDate) {

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

/*
    private Map<Integer, Summary> summaries;

    public Project(String name) {
        this.name = name;
        summaries = new HashMap<Integer, Summary>();
    }

    public void addTask(int summaryId, int taskId, String taskName, Date startDate, List<Resource> resources) {
        Summary s = summaries.containsKey(summaryId) ? summaries.get(summaryId) : new Summary(summaryId);
        s.addTask(taskId, taskName, startDate, resources);
        summaries.put(summaryId, s);
    }
*/
}
