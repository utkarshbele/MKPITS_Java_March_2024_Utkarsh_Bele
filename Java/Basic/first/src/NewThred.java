public class NewThred implements Runnable{
    @Override
    public void run() {
        System.out.println("are you comedy me...");

        while(true) {
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }



    }
}
