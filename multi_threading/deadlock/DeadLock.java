package multi_threading.deadlock;
/*
public class DeadLock {
    void m1(DeadLock obj2){
        System.out.println("Thread 1 waiting for thread 2 for releasing the lock");
        synchronized (obj2){
            System.out.println("Dead lock occure");
        }
    }
    void m2(DeadLock obj1)
    {
        System.out.println("Thread 2 waiting for thread 1 for releasing the lock");
        synchronized (obj1){
            System.out.println("deadlock occure");
        }
    }
}

class Thread1 extends Thread
{
    DeadLock obj1, obj2;
    Thread1(DeadLock obj1,DeadLock obj2){
        this.obj1=obj1;
        this.obj2=obj2;
    }

    @Override
    public void run() {
        synchronized (obj1){
            try {
              Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            obj2.m1(obj2);
        }
    }
}

class Thread2 extends Thread
{
    DeadLock obj1, obj2;
    Thread2(DeadLock obj1,DeadLock obj2){
        this.obj1=obj1;
        this.obj2=obj2;
    }

    @Override
    public void run() {
        synchronized (obj2){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            obj1.m2(obj1);
        }
    }
}

class DeadlockFin{
    public static void main(String[] args) {
        DeadLock obj1= new DeadLock();
        DeadLock obj2 = new DeadLock();

        Thread1 th1 = new Thread1(obj1, obj2);
        Thread2 th2= new Thread2(obj1, obj2);

        th1.start();
        th2.start();
    }
}

 */