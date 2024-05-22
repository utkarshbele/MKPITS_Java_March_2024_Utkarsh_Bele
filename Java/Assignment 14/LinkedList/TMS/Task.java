package Assinment14.LinkedList.TMS;
public class Task implements Comparable<Task>{
    private String taskName, priority, dueDate;
    private int taskId;

    public Task(int taskID, String taskName, String priority, String dueDate) {
        this.taskName = taskName;
        this.priority = priority;
        this.dueDate = dueDate;
        this.taskId = taskID;
    }

    // Getters and setters
    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public int getTaskId() {
        return taskId;
    }

    @Override
    public String toString() {
        return "Task Name: " + taskName + ", Task ID: " + taskId + ", Priority: " + priority + ", Due Date: " + dueDate;
    }

    @Override
    public int compareTo(Task task) {
        return dueDate.compareTo(((Task)task).dueDate);
    }
}
