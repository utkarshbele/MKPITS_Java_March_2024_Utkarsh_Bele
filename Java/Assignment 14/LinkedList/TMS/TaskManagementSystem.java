package Assinment14.LinkedList.TMS;
import java.util.Collections;
import java.util.LinkedList;

public class TaskManagementSystem {
    public static LinkedList<Task> taskLinkedList = new LinkedList<>();

    public static void addTask(int taskId,String taskName,String priority,String dueDate)
    {
        taskLinkedList.add(new Task(taskId,taskName, priority, dueDate));
        System.out.println("Task added successfully.");
    }
//remove task based on task id
    public static void removeTask(int taskId) {
        boolean removed = false;
        for (Task task : taskLinkedList) {
            if (task.getTaskId() == taskId) {
                taskLinkedList.remove(task);
                removed = true;
                System.out.println("Contact removed successfully.");
                break;
            }
        }
        if (!removed) {
            System.out.println("Contact not found.");
        }
    }
//search based on task id
    public static void searchTask(int taskId) {
        boolean found = false;
        for (Task task : taskLinkedList) {
            if (task.getTaskId() == taskId)
            {
                System.out.println("Task found:");
                System.out.println(task);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Task not found.");
        }
    }

    public static void displayTask() {
        if (taskLinkedList.isEmpty()) {
            System.out.println("No Tasks to display.");
        } else {
            //Sort Tasks by dueDate
            Collections.sort(taskLinkedList);
            for (Task task : taskLinkedList) {
                System.out.println(task);
            }
        }
    }
}

