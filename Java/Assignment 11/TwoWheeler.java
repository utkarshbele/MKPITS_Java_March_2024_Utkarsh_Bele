package assign11;

public class TwoWheeler extends Car implements MotorBike, Cycle{
    public TwoWheeler(String car) {
        super(car);
    }

    @Override
    public float distance() {
        return 50;
    }

    @Override
    public int speed() {
        return 90;
    }

    @Override
    public void displayName() {
        super.displayName();
    }
}
