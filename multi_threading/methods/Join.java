package multi_threading.methods;

//Joins method use to hold thread till first thread get excute completely.

public class Join extends Thread
{
    @Override
    public void run() {
        for(int i =1 ; i<=3 ; i++){
            System.out.println(Thread.currentThread().getName()+"-"+i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
class Child{
    public static void main(String[] args) throws InterruptedException {
        Join t1 = new Join();
        Join t2 = new Join();

        t1.start();
        t1.join();

        t2.start();
        t2.join();

        System.out.println("main thread finish exceution");
    }
}