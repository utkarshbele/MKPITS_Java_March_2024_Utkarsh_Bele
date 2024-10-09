import acc.Account1;
import org.w3c.dom.ls.LSOutput;
public class Main
{
    public static void main(String args[])
    {
        Account1 a = new Account1("Utkarsh", "65165165", 30000);

        String an = a.getName();
        System.out.println(an);

        System.out.println("Account number: " + a.getAccnum());
        System.out.println("Name: " + a.getName());
        System.out.println("Balance: " +a.getBalance());
        System.out.println(a.getBalance());
        a.depositAmount(5000);
        System.out.println(a.getBalance());
        a.withdrawAmount(10000);
        System.out.println(a.getBalance());

        Account1 acc1[]=new Account1[3];
        acc1[0]=new Account1("usu455","Utku",6500.0);
        acc1[1]=new Account1("rit215","Ritesh",5300.0);
        acc1[2]=new Account1("ah2145","Ash",42000.0);

        for(int i=0;i<acc1.length;i++)
        {
            System.out.println(acc1[i].getAccnum() + " " + acc1[i].getName() + " " + acc1[i].getBalance());
        }
    }
}



