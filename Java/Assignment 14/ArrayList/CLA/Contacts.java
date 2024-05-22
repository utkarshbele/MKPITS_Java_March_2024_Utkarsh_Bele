package Assinment14.ArrayList.CLA;

public class Contacts {
    private String name,email;
    private long contactID,phoneNumber;
    public Contacts()
    {}

    public Contacts(long contactID, String name, String email, long phoneNumber) {
        this.contactID = contactID;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
    //Getters
    public long getContactID() {
        return contactID;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }
    //Setters

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Contacts{" +
                "contactID='" + contactID + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
