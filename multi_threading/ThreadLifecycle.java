package multi_threading;

public class ThreadLifecycle extends Thread
{
    public static void main(String[] args) {
        ThreadLifecycle thread = new ThreadLifecycle();
        thread.setName("myThread");           // set name to thread

          thread.start();                     //start() : For new thread
       // thread.run();                       //run() : For main thread

        // System.out.println("message :"+thread.getState());
    }

    @Override
    public void run() {
        System.out.println("Running state on now in : " +Thread.currentThread().getName());
        test();
        try{
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("enterrpted exp occure there");
        }
    }
void test(){
    System.out.println("im testing purpose method");
}
}
