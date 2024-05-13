package assignment13;

public class NonPrimeThread extends Thread implements Runnable {
    @Override
    public void run() {
        for (int i = 2; i <= 10; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (!isPrime) {
                System.out.println("Non-Prime number is " + i);
            }
        }
    }
}
