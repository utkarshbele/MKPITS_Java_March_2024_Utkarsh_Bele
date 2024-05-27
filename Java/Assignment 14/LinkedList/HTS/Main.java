package Assinment14.LinkedList.HTS;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n1. Add a Webpage\n2. Remove a Webpage\n3. Search a Webpage\n4. Display Webpages\n5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter Webpage ID: ");
                    int pageId = scanner.nextInt();
                    System.out.print("Enter Webpage Name: ");
                    String title = scanner.next();
                    System.out.print("Enter Webpage URL ");
                    String url = scanner.next();
                    System.out.print("Enter visit date: ");
                    String visitDate = scanner.next();
                    HistoryTrackingSystem.addWebpage(pageId, title, url, visitDate);
                    break;
                case 2:
                    System.out.print("Enter Webpage ID to remove: ");
                    pageId = scanner.nextInt();
                    HistoryTrackingSystem.removeEvent(pageId);
                    break;
                case 3:
                    System.out.print("Enter Webpage URL to search: ");
                    url = scanner.next();
                    HistoryTrackingSystem.searchWebPage(url);
                    break;
                case 4:
                    System.out.print("Displaying Webpages on a specific date");
                    visitDate= scanner.next();
                    HistoryTrackingSystem.displayWebPage(visitDate);
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
