package utn.frre.lab2;

import java.util.Date;

abstract class TaskGroup extends TaskBase implements ICalculable {
    protected TaskGroup nextTask;

    public void setNextTask(TaskGroup nextTask) {
        this.nextTask = nextTask;
    }
    public TaskGroup getNextTask() {
        return nextTask;
    }

    public TaskGroup(int id, String name, Date startDate) {
        super(id, name, startDate);
    }

    public boolean hasNextTask() {
        return this.nextTask != null;
    }

    public abstract void closeTask(Date endDate);
}
