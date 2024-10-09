package final9_12;

public class Student extends Person{
    String rollno;

    public Student(String rollno) {
        this.rollno = rollno;
    }

    public Student(long id, String name, String number, String rollno) {
        super(id, name, number);
        this.rollno = rollno;
    }

    public String getRollno() {
        return rollno;
    }

    public void setRollno(String rollno) {
        this.rollno = rollno;
    }
}