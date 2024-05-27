package Assinment14.LinkedList.ESS;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n1. Add an Event\n2. Remove an Event\n3. Search an Event\n4. Display Events\n5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter Event ID: ");
                    int eventId = scanner.nextInt();
                    System.out.print("Enter Event Name: ");
                    String eventName = scanner.next();
                    System.out.print("Enter Event Location: ");
                    String location = scanner.next();
                    System.out.print("Enter Event Date: ");
                    String date = scanner.next();
                    System.out.print("Enter Event Time: ");
                    String time = scanner.next();
                    EventSchedulingSystem.addEvent(eventId, eventName, location, date, time);
                    break;
                case 2:
                    System.out.print("Enter Event ID to remove: ");
                    eventId = scanner.nextInt();
                    EventSchedulingSystem.removeEvent(eventId);
                    break;
                case 3:
                    System.out.print("Enter Event Name to search: ");
                    eventName = scanner.next();
                    EventSchedulingSystem.searchEvent(eventName);
                    break;
                case 4:
                    System.out.println("Displaying Events sorted on basis of Event Time");
                    EventSchedulingSystem.displayEvent();
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
