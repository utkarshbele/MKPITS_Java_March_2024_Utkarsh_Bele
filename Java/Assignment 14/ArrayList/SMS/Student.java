package Assinment14.ArrayList.SMS;
public class Student implements Comparable<Student> {
    private int id;
    private String name;
    private String grade;

    public Student(int id, String name, String grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGrade() {
        return grade;
    }

    public void displayDetails() {
        System.out.println("Student id is " + id);
        System.out.println("First name of the student is " + name);
        System.out.println("Overall Grade is " + grade);
    }

    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Grade: " + grade;
    }

    @Override
    public int compareTo(Student st) {
        return grade.compareTo(((Student)st).grade);
    }
}
