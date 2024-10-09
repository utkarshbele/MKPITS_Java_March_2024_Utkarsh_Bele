package assign11;

public class FullTimeEmployee extends Employee{
    int workingHours;

    @Override
    public double calculateSalary(int paymentPerHour, int workingHours) {
        return (workingHours*paymentPerHour);
    }
}
