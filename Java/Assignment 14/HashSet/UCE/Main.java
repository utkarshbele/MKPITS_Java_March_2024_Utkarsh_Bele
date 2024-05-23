package Assinment14.HashSet.UCE;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n1. Add Course\n2. Remove a Course\n3. Search a Course\n4. Display all Courses\n5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter a Course code: ");
                    String courseCode = scanner.next();
                    UniqueCourseEnrollment.addCourseCode(courseCode);
                    break;
                case 2:
                    System.out.print("Enter Course code to remove: ");
                    courseCode = scanner.next();
                    UniqueCourseEnrollment.removeCourseCode(courseCode);
                    break;
                case 3:
                    System.out.print("Enter Course code to search: ");
                    courseCode = scanner.next();
                    UniqueCourseEnrollment.searchCourseCode(courseCode);
                    break;
                case 4:
                    System.out.println("Displaying all Courses");
                    UniqueCourseEnrollment.displayCourseCode();
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
