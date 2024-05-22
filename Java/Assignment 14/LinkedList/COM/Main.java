package Assinment14.LinkedList.COM;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n1. Add an Order\n2. Remove an Order\n3. Update Quantity\n4. Display Orders\n5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter Order ID: ");
                    int orderId = scanner.nextInt();
                    System.out.print("Enter Order Name: ");
                    String customerName = scanner.next();
                    System.out.print("Enter Product Name: ");
                    String product = scanner.next();
                    System.out.print("Enter Order Quantity: ");
                    int quantity = scanner.nextInt();
                    System.out.print("Enter Task Due Date: ");
                    String orderDate = scanner.next();
                    CustomerOrderManagement.addOrder(orderId, customerName, product,quantity, orderDate);
                    break;
                case 2:
                    System.out.print("Enter Order ID to remove: ");
                    orderId = scanner.nextInt();
                    CustomerOrderManagement.removeOrder(orderId);
                    break;
                case 3:
                    System.out.println("Enter Order ID to update Quantity: ");
                    orderId = scanner.nextInt();
                    System.out.println("Enter Order Quantity: ");
                    quantity = scanner.nextInt();
                    CustomerOrderManagement.updateQuantity(orderId,quantity);
                    break;
                case 4:
                    System.out.println("Displaying Orders sorted on basis of Order Date");
                    CustomerOrderManagement.displayOrder();
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
