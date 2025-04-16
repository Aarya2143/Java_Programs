package multi_threading.producer_consumer;

class showroom
{
    int a;
    boolean flag = false;            // showroom full

    synchronized void producer(int a)
    {
        if(flag)          //Showroom is full
        {
            try {
                wait();          //Producer go in wait
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        this.a = a;
        flag = true;               //showroom empty
        System.out.println("produce car: "+a);
        notify();                  //produce cars
    }

    synchronized int consumer()
    {
        if(!flag)            //Showroom is empty
        {
            try {
                wait();       //Consumer go to wait
            }
            catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
            flag = false;         // showroom is full
            System.out.println("Consume car: "+a);
            notify();             // consume cars
            return a;
        }
}

public class PC_Anonymous {
    public static void main(String[] args) {
        showroom obj = new showroom();

        Thread t1 = new Thread()
        {
            @Override
            public void run() {
                for(int a =0; a<3 ; a++){
                    obj.producer(a);
                }
            }
        };

        Thread t2 = new Thread(){
            @Override
            public void run() {
                for(int a=0; a<3; a++)
                {
                    obj.consumer();
                }
            }
        };
        t1.start();
        t2.start();
    }
}
