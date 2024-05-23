package Assinment14.HashSet.UPIM;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n1. Add UID\n2. Remove a UID\n3. Search UID\n4. Display UIDs\n5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    UniqueProductIdentifierManager.addUID();
                    break;
                case 2:
                    System.out.print("Enter UID to remove: ");
                    String uid = scanner.next();
                    UniqueProductIdentifierManager.removeUID(uid);
                    break;
                case 3:
                    System.out.println("Enter UID to search: ");
                    uid = scanner.next();
                    UniqueProductIdentifierManager.checkUID(uid);
                    break;
                case 4:
                    System.out.println("Displaying all UIDs");
                    UniqueProductIdentifierManager.displayUID();
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
