package data;

public class Storage {
    private String name,address,email;

    public Storage(String name,String address,String email)
    {
        this.name = name;
        this.address = address;
        this.email = email;
    }
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public String getEmail() {
        return email;
    }
    public void setName(String name)
    {
        this.name= name;
    }
    public void setAddress(String address)
    {
        this.address= address;
    }
    public void setEmail(String email)
    {
        this.email= email;
    }


}