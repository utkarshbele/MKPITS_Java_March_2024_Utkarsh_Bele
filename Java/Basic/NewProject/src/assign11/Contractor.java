package assign11;

public class Contractor extends Employee{



    @Override
    public double calculateSalary(int paymentPerHour, int workingHours) {

        return (workingHours*paymentPerHour);
    }
}
