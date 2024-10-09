package platform;

public class Customer {
    private String name, id, address,mobile_number, payment_method;
    public Customer()
    {
        name="Utkarsh";
        id="87955";
        //....
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public String getMobile_number() {
        return mobile_number;
    }

    public String getPayment_method() {
        return payment_method;
    }
}
