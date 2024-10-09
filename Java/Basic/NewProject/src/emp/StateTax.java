package emp;

public interface StateTax {
    double calStateTax(double amount);

    default double CentralTax(double amount)
        {
            return (amount * 0.15);
        }
}
