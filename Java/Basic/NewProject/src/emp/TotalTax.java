package emp;

public class TotalTax implements StateTax{

    public static double Total(StateTax statetax,double amount)
    {
        return (statetax.CentralTax(amount)+statetax.calStateTax(amount));
// (statetax.getClass().getSimpleName() here get simple name is the methods of the class Class abd getClass is the method name of the Object class.
    }

    @Override
    public double calStateTax(double amount) {
        return 0;
    }
}
