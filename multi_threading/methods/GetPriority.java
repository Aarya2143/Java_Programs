package multi_threading.methods;

//use to return priority of current thread

public class GetPriority extends Thread
{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"Priority: "+getPriority());
    }
}
class dummy
{
    public static void main(String[] args) {
        GetPriority g1 = new GetPriority();
        GetPriority g2 = new GetPriority();

        g1.setPriority(Thread.MIN_PRIORITY);
        g2.setPriority(Thread.MAX_PRIORITY);

        g1.start();
        g2.start();

        System.out.println("main thread priority: "+Thread.currentThread().getPriority());
    //    System.out.println( g1.isAlive());
    }
}