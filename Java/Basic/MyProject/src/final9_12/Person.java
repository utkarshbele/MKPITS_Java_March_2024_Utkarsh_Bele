package final9_12;

public class Person {
    private String name;
    private long id;
    private String number;

    public Person() {
    }

    public Person(long id, String name, String number) {
        this.id = id;
        this.name = name;
        this.number = number;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public final void  displayInfo(){
        System.out.println(id+" "+number+" "+name);
    }

}