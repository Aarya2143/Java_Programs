package multi_threading;

public class Test extends Thread
{
    static final Object lock = new Object();
    void m1()
    {
        Test Thread1 = new Test();
        Thread1.setName("Aarya");

        Thread1.start();
    }
    @Override
    public void run() {
        synchronized (lock){
            for (int i = 0; i <= 5; i++) {
                System.out.println("Thread is: " + Thread.currentThread().getName() + i);
            }
        }
    }
}
class Test2 extends Test
{
    public static void main(String[] args) {
        Test2 Thread2 = new Test2();
        Thread2.setName("nikita");

        Thread2.m1();
        Thread2.start();
    }
    @Override
    public void run()
    {
        synchronized (lock)
        {
            for(int i = 0;i<=5; i++) {
                System.out.println("Thread is: " + Thread.currentThread().getName() + i);
            }
        }
    }
}

