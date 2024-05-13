package assignment13;
public class Account extends Thread implements Runnable{
    private double balance;
    public Account(double Balance){
        this.balance= Balance;
    }
    public synchronized void deposit(double depositAmt) throws InterruptedException {
        balance+=depositAmt;
        System.out.println("Deposit Amount="+depositAmt);
        System.out.println("Current Account Balance=" +balance);
    }
    public synchronized void withdraw(double withdrawAmt) throws InterruptedException {
        balance-= withdrawAmt;
        System.out.println("Withdrawal Amount="+withdrawAmt);
        System.out.println("Current Account Balance=" +balance);
    }
    public synchronized double getBalance()
    {
        return balance;
    }
}
