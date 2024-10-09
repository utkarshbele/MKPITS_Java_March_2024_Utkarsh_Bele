package acc;
public class Account1
{
        private String name;
        private String accnum;
        private double balance;

        public void Account1()
        {
            name = "Utkarsh";
            accnum = "87145";
            balance = 3200;
        }
        public Account1(String name, String accnum, double balance)
        {
            this.name=name;
            this.accnum= accnum;
            this.balance= balance;
        }

        public String getName()
        {
            return name;
        }
        public String getAccnum()
        {
            return accnum;
        }
         public double getBalance()
        {
            return balance;
         }

        public void depositAmount(double amount)
        {
            balance = balance + amount;

        }
        public void withdrawAmount(double amount)
        {
            balance = balance- amount;
        }
}
