package Assinment14.HashSet.DWF;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n1. Add Word\n2. Remove a Word\n3. Search a Word\n4. Display all Words\n5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter a word: ");
                    String word = scanner.next();
                    DuplicateWordFilter.addWord(word);
                    break;
                case 2:
                    System.out.print("Enter word to remove: ");
                    word = scanner.next();
                    DuplicateWordFilter.removeWord(word);
                    break;
                case 3:
                    System.out.print("Enter Word to search: ");
                    word = scanner.next();
                    DuplicateWordFilter.SearchWord(word);
                    break;
                case 4:
                    System.out.println("Displaying all Words");
                    DuplicateWordFilter.displayWord();
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
