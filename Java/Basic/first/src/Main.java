import inner_thread.OurThread;
import multithread_app.NonPrimeThread;
import multithread_app.PrimeThread;

public class Main {
    public static void main(String[] args) {

     /*   System.out.println(Thread.currentThread().getName());
        Thread thread=new Thread(new NewThred());
        Thread thread1=new Thread(new Thred2());
        thread.setName("Bhai");
        thread1.setName("Bro");
        thread.start();
        thread1.start();
        System.out.println("hello");


    Thread th1=new Thread(new PrimeThread());
    Thread th2=new Thread(new NonPrimeThread());
    th1.start();
    th2.start();
       System.out.println(Thread.activeCount());


//inner thread
       OurThread ot=new OurThread();
        ot.displayThread();


        //Anonymous Inner Class using Thread
        new Thread(new Runnable() {
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
            }
        }).start();
      */
        //Anonymous Inner class using Runnable Interface
        Runnable runnable=new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<100;i+=2)
                {
                    System.out.println("Even "+i);
                }
            }
        };
        Thread th=new Thread(runnable);
        th.start();
    }
    // an interface with a single abstract method is called as SAm(single abtsrtact method interface) or functional interface.

}