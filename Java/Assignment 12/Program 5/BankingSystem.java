package assignment_12;

public class BankingSystem {
    public static void main(String[] args) {
        Account savings = new Account() {
            @Override
            public double calculateInterest(double amount) {
                return amount*0.06;
            }

            @Override
            public void displayDetails() {
                System.out.println("Name: Utkarsh Bele");
                System.out.println("Address: Nagpur");
                System.out.println("Mob num: 8954166265");
                System.out.println();
            }
        };

        Account current= new Account() {
            @Override
            public double calculateInterest(double amount) {
                return amount*0.02;
            }

            @Override
            public void displayDetails() {
                System.out.println("Name: Sam Pitroda");
                System.out.println("Address: Nagpur");
                System.out.println("Mob num: 8900026265");
                System.out.println();
            }
        };

        Account fixed_deposit = new Account() {
            @Override
            public double calculateInterest(double amount) {
                return amount*0.08;
            }

            @Override
            public void displayDetails() {
                System.out.println("Name: Jeff Batra");
                System.out.println("Address: Nagpur");
                System.out.println("Mob num: 9632244265");
            }
        };

        System.out.println("The interest amount with 6% interest will be "+savings.calculateInterest(50000));
        savings.displayDetails();
        System.out.println("The interest amount with 2% interest will be "+current.calculateInterest(200000));
        current.displayDetails();
        System.out.println("The interest amount with 8% interest will be "+fixed_deposit.calculateInterest(600000));
        fixed_deposit.displayDetails();
    }
}