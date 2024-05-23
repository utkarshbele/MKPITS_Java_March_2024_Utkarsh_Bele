package Assinment14.HashSet.UVT;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        while (true) {
        System.out.println("\n1. Add IP\n2. Remove an IP\n3. Search an IP address\n4. Display all IP Addresses\n5. Exit");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.print("Enter a ipAddress: ");
                String ipAddress = scanner.next();
                UniqueVisitorTracker.addIP(ipAddress);
                break;
            case 2:
                System.out.print("Enter IP Address to remove: ");
                ipAddress = scanner.next();
                UniqueVisitorTracker.removeIP(ipAddress);
                break;
            case 3:
                System.out.print("Enter IP Address to search: ");
                ipAddress = scanner.next();
                UniqueVisitorTracker.SearchIP(ipAddress);
                break;
            case 4:
                System.out.println("Displaying all IP Addresses");
                UniqueVisitorTracker.displayIP();
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