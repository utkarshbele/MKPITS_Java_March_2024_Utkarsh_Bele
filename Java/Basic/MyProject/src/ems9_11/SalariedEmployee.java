package ems9_11;

public class SalariedEmployee extends Employee{
    public void calculateSalary(int num_month)
    {
        salary= num_month * salary;
        System.out.println("Your Salaried Salary is "+salary);
    }

}
