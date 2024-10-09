package assignment13;

public class Main {
    public static void main(String[] args) {
        Thread th1 = new Thread(new PrimeThread());
        Thread th2 = new Thread(new NonPrimeThread());
        th1.start();
        th2.start();
    }
}