package Assinment14.ArrayList.SMS;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Main {
    //Program 1 Student Management System using Array list
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n1. Add Student\n2. Remove Student\n3. Search Student\n4. Display All Students\n5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            int id;
            switch (choice) {
                case 1:
                    System.out.print("Enter student ID: ");
                    id = scanner.nextInt();
                    System.out.print("Enter student name: ");
                    String name = scanner.next();
                    System.out.print("Enter student grade: ");
                    String grade = scanner.next();
                    StudentManagementSystem.addStudent(id,name,grade);
                    break;
                case 2:
                    System.out.print("Enter student ID to remove: ");
                    id = scanner.nextInt();
                    StudentManagementSystem.removeStudent(id);
                    break;
                case 3:
                    System.out.print("Enter student ID to search: ");
                    id = scanner.nextInt();
                    StudentManagementSystem.searchStudent(id);
                    break;
                case 4:
                    StudentManagementSystem.displayAllStudents();
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