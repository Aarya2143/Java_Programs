package multi_threading.thread_creation;

public class ExtendsThread extends Thread
{
    public static void main(String[] args) {
        ExtendsThread thread = new ExtendsThread();
        thread.setName("Thread1");
        thread.start();

       // System.out.println(thread.getState());
    }

    @Override
    public void run() {
        System.out.println("running is on : "+Thread.currentThread().getState());
        test();
    }
    void test(){
        System.out.println("im the test");
    }
}
