package utn.frre.lab2;

import java.time.Period;
import java.util.Date;

public class Summary extends TaskGroup {

    public Summary(int id, String name, Task firstTask) {
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
        StringBuilder sb = new StringBuilder();
        TaskGroup temp = this.nextTask;
        while (temp.hasNextTask()) {
            sb.append(temp.toString());
            temp = nextTask.getNextTask();
        }
        return sb.toString();
    }

    /*
    private int id;
    private TaskGroup firstTask;
    private int taskCount;

    public Summary(int id) {
        this.id = id;
        taskCount = 0;
    }

    public boolean isEmpty() {
        return firstTask == null;
    }

    public void addTask(int taskId, String taskName, Date taskStartDate, List<Resource> resources) {
        Task t = new Task(taskId, taskName, taskStartDate, resources);

        if (this.isEmpty()) {
            firstTask = t;
        }
        else {
            Task last = this.getLastTask();
            last.closeTask(taskStartDate);
            last.setNextTask(t);
        }
        this.taskCount ++;
    }

    public Task getTaskById(int taskId) {
        Task t = firstTask;
        while (t.hasNextTask()) {
            if (t.getId() == taskId) {
                return t;
            }
        }
        return null;
    }

    public void setTaskResources(int taskId, Resource resource) {
        Task t = getTaskById(taskId);
        if(t == null) { throw new ProjectCustomException("No existe Tarea con id: " + taskId); };
        t.setResources(resource);
    }

    public Task getLastTask() {
        Task temp = this.firstTask;
        while (temp.hasNextTask()) {
            temp = firstTask.getNextTask();
        }
        return temp;
    }


    */
}
