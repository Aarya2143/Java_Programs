package multi_threading.thread_creation;

public class ImplementingRunnable implements Runnable
{
    public static void main(String[] args) {
        ImplementingRunnable runnable = new ImplementingRunnable();
        Thread thread = new Thread(runnable);
        thread.setName("ImptoThrad 1");
        thread.start();

     //   System.out.println(thread.getState());
    }
    @Override
    public void run() {
        System.out.println("Running is going : "+Thread.currentThread().getState());
        test();
    }
    void test(){
        System.out.println("im the test method");
    }
}
