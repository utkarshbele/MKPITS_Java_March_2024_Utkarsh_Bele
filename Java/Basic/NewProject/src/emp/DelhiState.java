package emp;

public class DelhiState implements StateTax{
    @Override
    public double calStateTax(double amount) {
        return (amount*0.02);
    }
}
