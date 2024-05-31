package ems9_11;

public class Employee {
    double salary=10000;
    String name, id;
    long mob;
    public void employee_Information(String name, String id,long mob)
    {
        this.name=name;
        this.id=id;
        this.mob=mob;
        System.out.println(name);
        System.out.println(id);
        System.out.println(mob);
        System.out.println(salary);
    }
    public void calculateSalary()
    {
        System.out.println("Your Salary is "+salary);
    }
}
