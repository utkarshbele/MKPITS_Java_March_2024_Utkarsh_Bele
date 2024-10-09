package library;

public class Library_Staff {
    private String staff_id, staff_name, staff_number, staff_address, late_fees;
    public Library_Staff()
    {
        staff_name="bdh";
        //....
    }
    //get and set
    public String late_fees(String late_fees)
    {
        this.latefees= late_fees;
        return late_fees;
    }
}
