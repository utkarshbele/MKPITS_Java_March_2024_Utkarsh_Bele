package banking9_5;

public class Main {
    public static void main(String[] args) {
        SavingsAccount sa= new SavingsAccount();
        System.out.println("Deposit");
        sa.deposit(100000);
        System.out.println("Withdraw");
        sa.withdraw(5000);
        sa.balanceInquiry();
        CurrentAccount ca= new CurrentAccount();
        System.out.println("Deposit");
        ca.deposit(15000);
        System.out.println("Withdraw");
        ca.withdraw(2000);
        ca.balanceInquiry();
    }
}
