package assignment13;
public class MainClass{
    public static void main(String[] args) throws InterruptedException {
        Account bankAccount=new Account(5000);
        Display deposit1=new Display(bankAccount,500);
        Display withdraw1=new Display(bankAccount,1000);
        Display deposit2=new Display(bankAccount,400);
        Display withdraw2=new Display(bankAccount,1000);
        deposit1.start();
        withdraw1.start();
        deposit2.start();
        withdraw2.start();
    }
}
