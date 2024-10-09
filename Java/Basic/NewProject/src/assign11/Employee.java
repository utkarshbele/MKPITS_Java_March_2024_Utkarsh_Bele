package assign11;

public abstract class Employee {
    String name;
    int paymentPerHour;
    int workingHours;
    public abstract double calculateSalary(int paymentPerHour, int workingHours);

}
