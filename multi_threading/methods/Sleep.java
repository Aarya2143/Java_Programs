package multi_threading.methods;

//sleep method use to sleep currently existing thread for sepecific mili second.
//use to pause current thread for specific amount of time.

public class Sleep extends Thread{
    public static void main(String[] args) {
        Sleep obj = new Sleep();
        obj.start();
    }
    @Override
    public void run() {
        System.out.println("run method");
        try {
            Thread.sleep(6000);
        }
        catch (IllegalArgumentException | InterruptedException A){
            System.out.println("catch block");
        }
        System.out.println("excution complete after 6 seconds");
    }
}
