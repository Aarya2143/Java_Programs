package multi_threading.deadlock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class DeadLock {
    private final Lock lock1 = new ReentrantLock();
    private final Lock lock2 = new ReentrantLock();

    void m1() {
        if (lock1.tryLock()) {
            try {
                Thread.sleep(100);
                if (lock2.tryLock()) {
                    try {
                        System.out.println("Thread1 acquired both locks");
                    } finally {
                        lock2.unlock();
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock1.unlock();
            }
        }
    }

    void m2() {
        if (lock2.tryLock()) {
            try {
                Thread.sleep(100);
                if (lock1.tryLock()) {
                    try {
                        System.out.println("Thread2 acquired both locks");
                    } finally {
                        lock1.unlock();
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock2.unlock();
            }
        }
    }
}

class Thread1 extends Thread {
    DeadLock obj;
    Thread1(DeadLock obj) { this.obj = obj; }
    public void run() { obj.m1(); }
}

class Thread2 extends Thread {
    DeadLock obj;
    Thread2(DeadLock obj) { this.obj = obj; }
    public void run() { obj.m2(); }
}

public class DeadlockSolution {
    public static void main(String[] args) {
        DeadLock obj = new DeadLock();
        new Thread1(obj).start();
        new Thread2(obj).start();
    }
}

