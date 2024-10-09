package thread;

public class YourThread extends Thread{

    int sum=0;
    public synchronized void run() {
        for(int i=0; i<=50; i++)
         {
            sum=sum+i;
        }
        notify();
    }
}
