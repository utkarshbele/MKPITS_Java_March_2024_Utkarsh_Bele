package emp;

public class GujState implements StateTax{
    @Override
    public double calStateTax(double amount) {
        return (amount*0.05);
    }
}
