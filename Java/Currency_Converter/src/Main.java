import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("Welcome to Currency Converter");
            System.out.println("Please Enter your currency from the choices given");
            System.out.println("\n1. Rupee\n2. US Dollar\n3. Australian Dollar\n4. Chinese Yuan\n5. English/British Pound\n6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            float amount;
            switch (choice) {
                case 1:
                    System.out.println("Please enter the amount");
                    amount = scanner.nextFloat();
                    Currency.convertRupee(amount);
                    break;
                case 2:
                    System.out.println("Please enter the amount");
                    amount = scanner.nextFloat();
                    Currency.convertUSD(amount);
                    break;
                case 3:
                    System.out.println("Please enter the amount");
                    amount = scanner.nextFloat();
                    Currency.convertAUD(amount);
                    break;
                case 4:
                    System.out.println("Please enter the amount");
                    amount = scanner.nextFloat();
                    Currency.convertYuan(amount);
                    break;
                case 5:
                    System.out.println("Please enter the amount");
                    amount = scanner.nextFloat();
                    Currency.convertPound(amount);
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