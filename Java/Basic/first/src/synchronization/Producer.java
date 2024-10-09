package synchronization;

public class Producer extends Thread{
    int i=1;
    Company company;
    Producer(Company company)
    {
        this.company=company;
    }

    @Override
    public void run() {
        while (true)
        {
            try {
                company.produce_item(i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            i++;
        }
    }
}
