package synchronization;
public class Company {
    int n;
    boolean f=false;

    public synchronized void produce_item(int n) throws InterruptedException {
        if(f)
        {
            wait();
        }
        this.n=n;
        System.out.println("Produced item: "+n);
        f=true;
        notify();
    }

    public synchronized void consume_item() throws InterruptedException {
        if(!f)
        {
            wait();
        }
        System.out.println("Consumed item: " +n);
        f=false;
        notify();
    }

}
