package Assinment14.ArrayList.SMS;
import java.util.*;

public class StudentManagementSystem {
    public static ArrayList<Student> students = new ArrayList<Student>();

    public static void addStudent(int id, String name, String grade) {
        students.add(new Student(id, name, grade));
        System.out.println("Student added successfully.");
    }

    public static void removeStudent(int id) {
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

    public static void searchStudent(int id) {
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

    public static void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students to display.");
        } else {
            //Sort students by grade
            Collections.sort(students);
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }
}