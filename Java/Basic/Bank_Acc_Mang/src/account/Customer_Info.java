package account;

public class Customer_Info {
    private String account_id, name, address, number, email;
    public Customer_Info()
    {
        account_id="852556";
        name="Utku";
        address="21, Alpha road";
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getAccount_id() {
        return account_id;
    }

    public String getEmail() {
        return email;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
