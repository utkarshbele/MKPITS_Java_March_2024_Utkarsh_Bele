package Assinment14.ArrayList.CLA;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n1. Add Contact\n2. Remove Contact\n3. Search Contact\n4. Update Contact\n5. Display Contacts\n6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter Contact ID: ");
                    long contactID = scanner.nextInt();
                    System.out.print("Enter Contact Name: ");
                    String name = scanner.next();
                    System.out.print("Enter Contact Email: ");
                    String email = scanner.next();
                    System.out.print("Enter Contact Number: ");
                    long phoneNumber = scanner.nextLong();
                    ContactListApplication.addContacts(contactID, name, email, phoneNumber);
                    break;
                case 2:
                    System.out.print("Enter Contact ID to remove: ");
                    contactID = scanner.nextInt();
                    ContactListApplication.removeContact(contactID);
                    break;
                case 3:
                    System.out.print("Enter Contact name to search: ");
                    name = scanner.next();
                    ContactListApplication.searchContact(name);
                    break;
                case 4:
                    System.out.print("Enter Contact ID that you want to update: ");
                    contactID = scanner.nextInt();
                    System.out.print("Enter Contact Number to update: ");
                    phoneNumber = scanner.nextLong();
                    System.out.print("Enter Contact Email to update: ");
                    email = scanner.next();
                    ContactListApplication.updateContact(contactID, phoneNumber, email);
                    break;
                case 5:
                    System.out.println("Contacts");
                    ContactListApplication.displayContact();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please enter again.");
            }
        }
    }
}