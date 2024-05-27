package Assinment14.LinkedList.PM;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n1. Add a Song\n2. Remove a Song\n3. Search a Song\n4. Display Songs\n5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter Song ID: ");
                    int songId = scanner.nextInt();
                    System.out.print("Enter Song Name: ");
                    String title = scanner.next();
                    System.out.print("Enter Artist Name: ");
                    String artist = scanner.next();
                    System.out.print("Enter Album name: ");
                    String album = scanner.next();
                    System.out.print("Enter Song Duration: ");
                    int duration = scanner.nextInt();
                    PlayListManager.addSong(songId, title, artist, album, duration);
                    break;
                case 2:
                    System.out.print("Enter Song ID to remove: ");
                    songId = scanner.nextInt();
                    PlayListManager.removeSong(songId);
                    break;
                case 3:
                    System.out.print("Enter Song Title to search: ");
                    title = scanner.next();
                    PlayListManager.searchSong(title);
                    break;
                case 4:
                    System.out.println("Displaying Songs sorted on basis of Duration");
                    PlayListManager.displaySong();
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
