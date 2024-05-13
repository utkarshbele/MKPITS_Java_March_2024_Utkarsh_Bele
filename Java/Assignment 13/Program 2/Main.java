package assignment13;

public class Main {
    public static void main(String[] args) {
        Thread th1 = new Thread(new PrimeThread());
        Thread th2 = new Thread(new NonPrimeThread());
        Thread th3=new Thread(new TestDaemon());
        th1.start();
        th2.start();
        th3.setDaemon(true);
        th3.start();
        //System.out.println(Thread.activeCount());
    }
}