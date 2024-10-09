public class Thred2 extends Thread{
    @Override
    public void run() {
        while (true) {
            System.out.println(Thread.currentThread().getName());

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
