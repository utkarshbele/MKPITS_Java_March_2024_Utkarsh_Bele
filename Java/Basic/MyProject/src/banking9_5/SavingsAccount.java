package banking9_5;

public class SavingsAccount extends BankAccount
{
    private String name,accno;
    private double amt,balance=0;
    public SavingsAccount(String name, String accno) {
        this.name=name;
        this.accno=accno;
    }
    public SavingsAccount()
    {
        name= "Utkarsh";
        accno="854add";
    }
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
        System.out.println("You savings balance is"+balance);
    }
}
