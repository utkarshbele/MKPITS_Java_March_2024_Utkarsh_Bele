package ems9_11;

public class Main {
    public static void main(String[] args) {
        HourlyEmployee he= new HourlyEmployee();
        he.calculateSalary(5);
        SalariedEmployee se= new SalariedEmployee();
        se.calculateSalary(1);
    }
}
