package ems9_11;

public class HourlyEmployee extends Employee{
    int hour=0;
    public void calculateSalary(int hour)
    {
        int hourly_rate= 20;
        this.hour=hour;
        salary= salary+ (200*(hour));
        System.out.println("Your Hourly Salary is "+salary);
    }
}
