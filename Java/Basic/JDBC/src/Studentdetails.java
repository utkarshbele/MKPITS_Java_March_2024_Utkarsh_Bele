public class Studentdetails {
    private String rollno, name, address, city;

    public Studentdetails(String rollno, String name, String address, String city) {
        this.rollno = rollno;
        this.name = name;
        this.address = address;
        this.city = city;
    }

    public String getRollno() {
        return rollno;
    }

    public void setRollno(String rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
