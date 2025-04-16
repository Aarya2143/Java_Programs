package multi_threading.methods;

//yeild method pause excution of current thread and allow another thread of equal & high priority taht are waiting to execute.

public class Yeild implements Runnable
{
    @Override
    public void run() {
        System.out.println(Thread.currentThread());
        Thread.yield();
        System.out.println(Thread.currentThread());
    }

    public static void main(String[] args) {
        Yeild a1 = new Yeild();
        Thread t1 = new Thread(a1,"Parent thread");

        Yeild a2 = new Yeild();
        Thread t2 = new Thread(a2,"child thread");

        t1.setPriority(4);
        t2.setPriority(8);

        t1.start();
        t2.start();
    }
}