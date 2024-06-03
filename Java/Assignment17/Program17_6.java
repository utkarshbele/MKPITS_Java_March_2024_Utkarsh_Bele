package Assignment17;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Program17_6 {
    public static void main(String[] args) {
        HashMap<String, String> studentGrades = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            System.out.println("Menu:");
            System.out.println("1. Add a student and grade");
            System.out.println("2. Update a student's grade");
            System.out.println("3. Delete a student");
            System.out.println("4. Retrieve a student's grade");
            System.out.println("5. Display all students");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String nameToAdd = scanner.next();
                    System.out.print("Enter student grade: ");
                    String gradeToAdd = scanner.next();
                    studentGrades.put(nameToAdd, gradeToAdd);
                    System.out.println("Student added successfully.");
                    break;
                case 2:
                    System.out.print("Enter student name: ");
                    String nameToUpdate = scanner.next();
                    if (studentGrades.containsKey(nameToUpdate)) {
                        System.out.print("Enter new grade: ");
                        String newGrade = scanner.next();
                        studentGrades.put(nameToUpdate, newGrade);
                        System.out.println("Grade updated successfully.");
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;
                case 3:
                    System.out.print("Enter student name: ");
                    String nameToDelete = scanner.next();
                    if (studentGrades.remove(nameToDelete) != null) {
                        System.out.println("Student deleted successfully.");
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;
                case 4:
                    System.out.print("Enter student name: ");
                    String nameToRetrieve = scanner.next();
                    String grade = studentGrades.get(nameToRetrieve);
                    if (grade != null) {
                        System.out.println("Grade of " + nameToRetrieve + ": " + grade);
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;
                case 5:
                    System.out.println("List of all students and their grades:");
                    for (Map.Entry<String, String> entry : studentGrades.entrySet())
                    {
                        System.out.println(entry.getKey() + ": " + entry.getValue());
                    }
                    break;
                case 6:
                    exit = true;
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
        scanner.close();
    }
}
