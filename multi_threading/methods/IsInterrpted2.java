package multi_threading.methods;

/*
Case 2: Interrupting a thread that stops working: In the program, after interrupting the currently executing thread,
we are throwing a new exception in the catch block so it will stop working.
*/
public class IsInterrpted2 extends Thread
{
    @Override
    public void run() {
        try{
            Thread.sleep(3000);
            System.out.println("Thread start after 3 sec sleep");
        } catch (InterruptedException e) {
            throw new RuntimeException("In catch block");
        }
    }

    public static void main(String[] args) {
        IsInterrpted2 obj = new IsInterrpted2();
        obj.start();
        try{
            obj.interrupt();
        } catch (Exception e) {
            System.out.println("Exception handle here");
        }
    }
}
