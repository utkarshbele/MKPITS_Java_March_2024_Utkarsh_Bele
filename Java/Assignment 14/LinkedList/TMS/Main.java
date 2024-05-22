package Assinment14.LinkedList.TMS;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n1. Add a Task\n2. Remove a Task\n3. Search a Task\n4. Display Tasks\n5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter Task ID: ");
                    int taskId = scanner.nextInt();
                    System.out.print("Enter Task Name: ");
                    String taskName = scanner.next();
                    System.out.print("Enter Task Priority: ");
                    String priority = scanner.next();
                    System.out.print("Enter Task Due Date: ");
                    String dueDate = scanner.next();
                    TaskManagementSystem.addTask(taskId,taskName, priority, dueDate);
                    break;
                case 2:
                    System.out.print("Enter Task ID to remove: ");
                    taskId = scanner.nextInt();
                    TaskManagementSystem.removeTask(taskId);
                    break;
                case 3:
                    System.out.print("Enter Task ID to search: ");
                    taskId = scanner.nextInt();
                    TaskManagementSystem.searchTask(taskId);
                    break;
                case 4:
                    System.out.println("Displaying Tasks sorted on basis of Due Date");
                    TaskManagementSystem.displayTask();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please enter again.");
            }
        }
    }
}