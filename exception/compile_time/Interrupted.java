package exception.compile_time;

public class Interrupted {
    /*
    public static void main(String[] args) throws InterruptedException {
        System.out.println("hii");
        Interrupted in = new Interrupted();
        Thread.sleep(1000);
    }
    */
    public static void main(String[] args) {
        System.out.println("hii");
        Interrupted in = new Interrupted();
        try
        {
            Thread.sleep(1000);
        }
        catch (InterruptedException inp)
        {
            System.out.println("Intrupted exp occure here");
        }
    }
}

