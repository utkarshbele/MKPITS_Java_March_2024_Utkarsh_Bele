package finalConstructor9_15;
public class Main {
    public static void main(String[] args) {
        ImmutablePoint point1 = new ImmutablePoint(3, 4);
        ImmutablePoint point2 = new ImmutablePoint(3, 4);
        ImmutablePoint point3 = new ImmutablePoint(5, 6);

        System.out.println("Point 1: " + point1);
        System.out.println("Point 2: " + point2);
        System.out.println("Point 3: " + point3);
    }
}

