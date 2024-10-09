package final9_12;

public class Teacher extends Person{
    private String subject;

    public Teacher(String subject) {
        this.subject = subject;
    }

    public Teacher(long id, String name, String number, String subject) {
        super(id, name, number);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

}