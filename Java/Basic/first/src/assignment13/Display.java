package assignment13;
public class Display extends Thread {
    private Account account;
    private double amount;

    public Display(Account account, double amount){
        this.account=account;
        this.amount=amount;
    }
    public void run(){
        try {
            account.deposit(amount);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            account.withdraw(amount);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}


