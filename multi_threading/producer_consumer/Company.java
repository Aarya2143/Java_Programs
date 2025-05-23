package multi_threading.producer_consumer;

public class Company {
    int n;
    boolean f = false;

    synchronized public void produce_item(int n) throws InterruptedException{
        if(f)
        {
            wait();
        }
        this.n=n;
        System.out.println("Produced: "+this.n);
        f=true;
        notify();
    }

    synchronized public int consume_item(int n)throws InterruptedException{
        if(!f){
            wait();
        }
        System.out.println("Consumer: "+this.n);
        f= false;
        notify();
        return this.n;
    }
}
