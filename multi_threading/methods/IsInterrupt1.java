package multi_threading.methods;

/*Case 1: Interrupting a thread that doesn’t stop working: In the program, we handle the InterruptedException
using try and catch block, so whenever any thread interrupts the currently executing thread it will come out
from the sleeping state but it will not stop working. */

public class IsInterrupt1 extends Thread {

    @Override
    public void run() {
        try {
            for (int i = 0; i < 3; i++) {
                System.out.println("Child class thread class");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Interrupted exception occure here");
        }
    }
}
class Dumm{
    public static void main(String[] args) throws InterruptedException{
        IsInterrupt1 obj = new IsInterrupt1();
        obj.start();
        obj.interrupt();
        System.out.println("Out of box");
    }
}

