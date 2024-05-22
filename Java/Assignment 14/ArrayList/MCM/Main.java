package Assinment14.ArrayList.MCM;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n1. Add a Movie\n2. Remove a movie by ID\n3. Search a movie by Title\n4. Display Movies by genre\n5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter Movie ID: ");
                    long movieId = scanner.nextLong();
                    System.out.print("Enter Movie Title: ");
                    String movieName = scanner.next();
                    System.out.print("Enter Movie Directors name: ");
                    String dirName = scanner.next();
                    System.out.print("Enter Movie Release Date: ");
                    String releaseDate = scanner.next();
                    System.out.print("Enter Movie genre: ");
                    String genre = scanner.next();
                    MovieCollectionManager.addMovie(movieId,movieName,dirName,genre,releaseDate);
                    break;
                case 2:
                    System.out.print("Enter Movie ID to remove: ");
                    movieId = scanner.nextLong();
                    MovieCollectionManager.removeMovie(movieId);
                    break;
                case 3:
                    System.out.print("Enter Movie Title to search: ");
                    movieName = scanner.next();
                    MovieCollectionManager.searchStudent(movieName);
                    break;
                case 4:
                    System.out.print("Enter Movie genre: ");
                    genre = scanner.next();
                    MovieCollectionManager.displayAllMovies(genre);
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
