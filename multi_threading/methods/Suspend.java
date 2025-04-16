package multi_threading.methods;

// pause thread till resume is call

public class Suspend extends Thread
{
    @Override
    public void run() {
        for(int i =1 ; i<=3 ; i++){
            System.out.println(Thread.currentThread().getName()+ " = "+i );
            try{
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class extended {
    public static void main(String[] args) {
        Suspend T1 = new Suspend();

        T1.start();
        try {
                Thread.sleep(500);
                T1.suspend();
                System.out.println("thread T1 is suspended");

                Thread.sleep(500);
                T1.resume();
                System.out.println("Thread T2 is resume");
            }
        catch (InterruptedException E){
            System.out.println(E);
        }
    }
}
