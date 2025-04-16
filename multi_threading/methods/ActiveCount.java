package multi_threading.methods;

//Use to return active count of thread

public class ActiveCount extends Thread
{
    @Override
    public void run() {
        try{
            Thread.sleep(1000);
        }
        catch (InterruptedException B){
            System.out.println("catch block");
        }
    }
}
class ActiveClass {
    public static void main(String[] args) {
        System.out.println("Active thread before :"+Thread.activeCount());

        ActiveCount t1 = new ActiveCount();
      //  ActiveCount t2 = new ActiveCount();

        t1.start();


        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            System.out.println("Sleep interrupted");
        }

        System.out.println("Active thread after T1 and T2 :"+Thread.activeCount());

        try {
            t1.join();

        } catch (InterruptedException e) {
            System.out.println("catch block 2");
        }

        System.out.println("Ending thread: " +Thread.activeCount());
    }
}