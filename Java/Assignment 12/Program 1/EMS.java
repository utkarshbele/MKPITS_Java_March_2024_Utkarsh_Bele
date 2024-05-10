package assignment_12;
public class EMS {
    public static void main(String[] args) {
        Employee fullTimeEmp=new Employee() {
            @Override
            public double calculateSalary() {
                return 35*40*30;
            }
            @Override
            public void displayDetails() {
                System.out.println("Name: Utkarsh Bele");
                System.out.println("Address: Nagpur");
                System.out.println("Status: Full time Employee");
                System.out.println("Mob num: 8954166265");
                System.out.println();
            }
        };

        Employee partTimeEmp=new Employee() {
            @Override
            public double calculateSalary() {
                return 40*40*30;
            }
            @Override
            public void displayDetails() {
                System.out.println("Name: Sam Pitroda");
                System.out.println("Address: Nagpur");
                System.out.println("Status: Part time Employee");
                System.out.println("Mob num: 8900026265");
                System.out.println();
            }
        };

        Employee contractEmp=new Employee() {
            @Override
            public double calculateSalary() {
                return 37*40*30;
            }
            @Override
            public void displayDetails() {
                System.out.println("Name: Jeff Batra");
                System.out.println("Address: Nagpur");
                System.out.println("Status: Contract Employee");
                System.out.println("Mob num: 9632244265");
            }
        };
        System.out.println("The Salary is "+fullTimeEmp.calculateSalary());
        fullTimeEmp.displayDetails();
        System.out.println("The Salary is "+partTimeEmp.calculateSalary());
        partTimeEmp.displayDetails();
        System.out.println("The Salary is "+contractEmp.calculateSalary());
        contractEmp.displayDetails();
    }
}
