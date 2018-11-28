package utn.frre.lab2;

import java.util.Date;

abstract class TaskBase {
    protected int id;
    protected String name;
    protected Date startDate;
    protected Date endDate;
    protected float progress;

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public Date getStartDate() {
        return startDate;
    }
    public Date getEndDate() {
        return endDate;
    }
    public float getProgress() {
        return progress;
    }
    public void setProgress(float progress) {
        this.progress = progress;
    }

    public TaskBase(int id, String name, Date startDate) {
        this.id = id;
        this.name = name;
        this.startDate = startDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Task)) return false;

        Task task = (Task) o;

        return id == task.id;
    }
    @Override
    public int hashCode() {
        return id * name.hashCode();
    }
}
