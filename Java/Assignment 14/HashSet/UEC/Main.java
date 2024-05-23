package Assinment14.HashSet.UEC;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n1. Add an Email\n2. Remove an Email\n3. Search Email\n4. Display Emails\n5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter Email address: ");
                    String email = scanner.next();
                    UniqueEmailCollector.addEmail(email);
                    break;
                case 2:
                    System.out.print("Enter Email address to remove: ");
                    email = scanner.next();
                    UniqueEmailCollector.removeEmail(email);
                    break;
                case 3:
                    System.out.println("Enter Email address to search: ");
                    email = scanner.next();
                    UniqueEmailCollector.checkEmail(email);
                    break;
                case 4:
                    System.out.println("Displaying all unique Emails");
                    UniqueEmailCollector.displayEmail();
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
