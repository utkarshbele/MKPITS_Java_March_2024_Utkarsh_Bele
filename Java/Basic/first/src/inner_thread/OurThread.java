package inner_thread;

public class OurThread {
    public class PrimeThread extends Thread {
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
                if (isPrime) {
                    System.out.println("Prime number is " + i);
                }
            }
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public class NonPrimeThread implements Runnable {
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
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public void displayThread()
    {
        Thread th1=new Thread(new PrimeThread());
        Thread th2= new Thread(new NonPrimeThread());
        th1.start();
        th2.start();
    }
}
