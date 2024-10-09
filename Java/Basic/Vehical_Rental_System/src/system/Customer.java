package system;

public class Customer {
    private String name, address, mobnum,licence;
    public Customer()
    {
        name="Utkarsh";
        address="45, downing street";
        mobnum="8974615325";
        licence="NO654156Mnk";
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getLicence() {
        return licence;
    }

    public String getMobnum() {
        return mobnum;
    }
}
