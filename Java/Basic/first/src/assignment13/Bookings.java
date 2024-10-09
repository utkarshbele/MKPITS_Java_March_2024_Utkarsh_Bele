package assignment13;
public class Bookings extends Thread {
    static int total_earning = 0;
    int amount;

    public Bookings(int amount) {
        this.amount = amount;
    }

    public void run() {
        synchronized (Bookings.class) {
            total_earning += amount;
            System.out.println(Thread.currentThread().getName() + " The rent for this room is " + amount);
            System.out.println("The total earnings are " + total_earning);
        }
    }
}