package multi_threading.achieve_thread_safty;

public class SynchronizationUsingLock extends Thread {

    static final Object lock = new Object();

    public static void main(String[] args) throws InterruptedException {
        SynchronizationUsingLock thread1 = new SynchronizationUsingLock();
        thread1.setName("Ramesh");

        SynchronizationUsingLock thread2 =  new SynchronizationUsingLock();
        thread2.setName("Suresh");

        SynchronizationUsingLock thread3 =  new SynchronizationUsingLock();
        thread3.setName("Kamlesh");

        thread2.start();

        thread3.start();

        thread1.start();
    }

    @Override
    public void run() {
        synchronized (lock)
        {
            for(int i = 0; i <=3 ; i++){
                System.out.println(Thread.currentThread().getName() + " and index is "+i);
            }
        }
    }
}

