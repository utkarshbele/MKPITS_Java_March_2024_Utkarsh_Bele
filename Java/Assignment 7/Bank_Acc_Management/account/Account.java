package account;

public class Account {
    private String account_id;
    private double balance, amc;

    public double getBalance() {
        return balance;
    }

    public void setDeposit(double amt) {
        balance = balance + amt;

    }

    public void setWithdraw(double amt) {
        balance=balance-amt;
    }

    public double getAmc() {
        return amc;
    }
}
