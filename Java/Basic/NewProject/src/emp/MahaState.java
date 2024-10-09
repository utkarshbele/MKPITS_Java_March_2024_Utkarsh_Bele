package emp;

public class MahaState implements StateTax{
    @Override
    public double calStateTax(double amount) {
        return (amount*0.1);
    }


    @Override
    public String toString() {
        return "Maharashtra";
    }
}
