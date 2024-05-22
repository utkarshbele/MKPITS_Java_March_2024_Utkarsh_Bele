package Assinment14.LinkedList.TMS;

import java.util.Date;

public class Task {
    private String taskName, priority;
    Date dueDate;
    private int taskId;

    public Task(int taskID, String taskName, String priority, Date dueDate) {
        this.taskName = taskName;
        this.priority = priority;
        this.dueDate = dueDate;
        this.taskId = taskID;
    }

    // Getters and setters
    public int getTaskID() {
        return taskId;
    }

    public void setTaskID(int taskID) {
        this.taskId = taskID;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public String toString() {
        return "Task Name: " + taskName + ", Task ID: " + taskId + ", Priority: " + priority + ", Due Date: " + dueDate;
    }
}
