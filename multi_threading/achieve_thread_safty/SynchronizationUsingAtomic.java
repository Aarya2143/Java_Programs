package multi_threading.achieve_thread_safty;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

public class SynchronizationUsingAtomic extends Thread {

    static final ReentrantLock lock = new ReentrantLock(); // Lock to ensure ordered execution
    static AtomicInteger index = new AtomicInteger(0);

    public static void main(String[] args) {
        SynchronizationUsingAtomic thread1 = new SynchronizationUsingAtomic();
        thread1.setName("Ramesh");

        SynchronizationUsingAtomic thread2 = new SynchronizationUsingAtomic();
        thread2.setName("Suresh");

        SynchronizationUsingAtomic thread3 = new SynchronizationUsingAtomic();
        thread3.setName("Kamlesh");

        thread2.start();
        thread3.start();
        thread1.start();
    }

    @Override
    public void run() {
        lock.lock(); // Ensure only one thread prints at a time
        try {
            index.set(0); // Reset index for each thread
            for (int i = 0; i <= 3; i++) {
                System.out.println(Thread.currentThread().getName() + " and index is " + index.getAndIncrement());
            }
        }
        finally {
            lock.unlock(); // Release the lock
        }
    }
}

