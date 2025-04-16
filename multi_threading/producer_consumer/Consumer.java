package multi_threading.producer_consumer;

public class Consumer extends Thread
{
    Company c;
    Consumer(Company c) {
        this.c = c;
    }

    @Override
    public void run() {
        int i = 0;
        while (true) {
            try {
                this.c.consume_item(i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            i++;
        }
    }
}
