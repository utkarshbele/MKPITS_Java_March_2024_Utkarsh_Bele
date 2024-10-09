package thread;

public class Main extends Thread{
    public static void main(String[] args){
        YourThread thread=new YourThread();
        thread.start();
        synchronized (thread) {
            try {
                thread.wait();
            } catch (Exception e) {
                System.out.println("Ignore exception");
            }
        }
        System.out.println("Sum is "+thread.sum);
    }
}
