package synchronization;

public class Consumer extends Thread{
    Company company;
    Consumer(Company company){
        this.company=company;
    }

    @Override
    public void run() {
        while(true)
        {
            try {
                company.consume_item();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
