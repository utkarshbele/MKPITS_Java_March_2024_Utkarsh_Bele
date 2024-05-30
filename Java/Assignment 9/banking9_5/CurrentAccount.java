package banking9_5;

public class CurrentAccount extends BankAccount
{
    private String name,accno;
    private double amt,balance=0;
    @Override
    public void deposit(double amt) {
        balance=balance+amt;
        System.out.println(balance);
    }

    @Override
    public void withdraw(double amt) {
        balance=balance-amt;
        System.out.println(balance);
    }

    @Override
    public void balanceInquiry() {
        System.out.println("Your current balance is"+balance);
    }
}
