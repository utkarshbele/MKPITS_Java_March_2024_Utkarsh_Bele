package assignment13;
public class Hotel {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            int rent = (int) (Math.random() * 100 * 36);
            Bookings thread = new Bookings(rent);
            thread.start();
        }
    }
}