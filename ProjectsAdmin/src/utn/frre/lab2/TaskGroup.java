package utn.frre.lab2;

import java.util.Date;

abstract class TaskGroup extends TaskBase implements ICalculable {

    public TaskGroup(int id, String name, Date startDate) {
        super(id, name, startDate);
    }

    protected void closeTask(Date endDate) {
        this.progress = 100;
        this.endDate = endDate;
    }
}
