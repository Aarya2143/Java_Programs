package multi_threading.methods;

//Each thread has service provider is daemon return in BOOLEAN

public class IsDaemonmethod extends Thread
{
    @Override
    public void run()
    {
        System.out.println(Thread.currentThread().getName()+ " is demon = "+ isDaemon());
    }
}
class ext {
    public static void main(String[] args) {
        IsDaemonmethod t1 = new IsDaemonmethod();
        IsDaemonmethod t2 = new IsDaemonmethod();
        IsDaemonmethod t3 = new IsDaemonmethod();

        t1.setDaemon(true);
        t2.setDaemon(true);


        t1.start();
        t2.start();
        t3.start();

        System.out.println("thread end");
    }
}
