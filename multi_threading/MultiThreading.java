package multi_threading;

public class MultiThreading extends Thread {
    @Override
    public void run() {
        for(int i =1; i<=5; i++)
        {
            System.out.println(Thread.currentThread().getName()+ ":" +i);

            try{
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("im in catch block");
            }
        }
    }
}
class newclass{
    public static void main(String[] args) {
       MultiThreading t1 = new MultiThreading();
       MultiThreading t2 = new MultiThreading();

       t1.start();
       t2.start();
    }
}