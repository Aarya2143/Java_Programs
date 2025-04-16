package multi_threading.methods;

//Using IsInterrupted() method because stop() is depricated in java1.2

public class Stop extends Thread
{
    @Override
    public void run() {
        System.out.println("Thread is running ");
        int i = 0;
        while(i<10){
            if(i==5)
           if(!Thread.currentThread().isInterrupted())
            {
                System.out.println("Status of current thread : "+ !Thread.currentThread().isInterrupted());
                return;
            }
            i = i+1;
        }
    }

    public static void main(String[] args) {
        Stop thread1 = new Stop();
        Thread obj = new Thread(thread1);
        thread1.start();
    }
}