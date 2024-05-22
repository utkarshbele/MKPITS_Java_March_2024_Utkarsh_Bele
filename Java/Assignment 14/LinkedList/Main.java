package Assinment14.LinkedList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
public class Main {
    private static ArrayList<Student> students = new ArrayList<>();
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.println("\n1. Add Student\n2. Remove Student\n3. Search Student\n4. Display All Students\n5. Exit");
                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline
                switch (choice) {
                    case 1:
                        addStudent(scanner);
                        break;
                    case 2:
                        removeStudent(scanner);
                        break;
                    case 3:
                        searchStudent(scanner);
                        break;
                    case 4:
                        displayAllStudents();
                        break;
                    case 5:
                        System.out.println("Exiting...");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter again.");
                }
            }
        }

        private static void addStudent(Scanner scanner) {
            System.out.print("Enter student ID: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            System.out.print("Enter student name: ");
            String name = scanner.nextLine();
            System.out.print("Enter student grade: ");
            int grade = scanner.nextInt();
            students.add(new Student(id, name, grade));
            System.out.println("Student added successfully.");
        }

        private static void removeStudent(Scanner scanner) {
            System.out.print("Enter student ID to remove: ");
            int id = scanner.nextInt();
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

        private static void searchStudent(Scanner scanner) {
            System.out.print("Enter student ID to search: ");
            int id = scanner.nextInt();
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
                // Sort students by grade
                Collections.sort(students, Comparator.comparingInt(Student::getGrade));
                System.out.println("All students sorted by grade:");
                for (Student student : students) {
                    System.out.println(student);
                }
            }
        }
    }
