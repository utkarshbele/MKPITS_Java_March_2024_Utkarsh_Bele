package Assinment14.ArrayList.SMS;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Main {
    //Program 1 Student Management System using Array list
    public static ArrayList<Student> students = new ArrayList<Student>();

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
                    addStudent(id,name,grade);
                    break;
                case 2:
                    System.out.print("Enter student ID to remove: ");
                    id = scanner.nextInt();
                    removeStudent(id);
                    break;
                case 3:
                    System.out.print("Enter student ID to search: ");
                    id = scanner.nextInt();
                    searchStudent(id);
                    break;
                case 4:
                    displayAllStudents();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please enter again.");
            }
        }
    }

    private static void addStudent(int id, String name, String grade) {
        students.add(new Student(id, name, grade));
        System.out.println("Student added successfully.");
    }

    private static void removeStudent(int id) {
        boolean removed = false;
        for (Student student : students) {
            if (student.getId() == id) {
                students.remove(student);
                removed = true;
                System.out.println("Student removed successfully.");
                break;
            }
        }
        if (!removed) {
            System.out.println("Student not found.");
        }
    }

    private static void searchStudent(int id) {
        boolean found = false;
        for (Student student : students) {
            if (student.getId() == id) {
                System.out.println("Student found:");
                System.out.println(student);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Student not found.");
        }
    }

    private static void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students to display.");
        } else {
            //Sort students by grade using comparable inteface
            Collections.sort(students);
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }
}
