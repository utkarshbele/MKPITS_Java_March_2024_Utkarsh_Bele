package const9_10;

public class Constants {
    public final static double SPEED_OF_LIGHT=299792458.0;
    public static final double GRAVITATIONAL_CONSTANT = 6.67408e-11;
    public static final double PLANCKS_CONSTANT = 6.62607015E-34;

    public void distance(float t)
    {
        double distance = SPEED_OF_LIGHT * t; // distance traveled by light in 5 seconds
        System.out.println("The distance travelled in "+t+" seconds is "+distance);
    }

}
