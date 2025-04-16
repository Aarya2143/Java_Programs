package multi_threading.achieve_thread_safty;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicVariable extends Thread {

    static AtomicInteger index = new AtomicInteger(0);

    public static void main(String[] args) {
        AtomicVariable thread1 = new AtomicVariable();
        thread1.setName("Ramesh");

        AtomicVariable thread2 = new AtomicVariable();
        thread2.setName("Suresh");

        AtomicVariable thread3 = new AtomicVariable();
        thread3.setName("Kamlesh");

        thread2.start();
        thread3.start();
        thread1.start();
    }

    @Override
    public void run() {
        for (int i = 0; i <= 3; i++) {
            int currentIndex = index.getAndIncrement(); // Atomically increments and gets the value
            System.out.println(Thread.currentThread().getName() + " and index is " + currentIndex);
        }
    }
}

