package multi_threading.methods;

//Current thread return reference of current existing thread

public class CurrentThread {
    public static void main(String[] args) {
        Thread obj = new Thread();
        System.out.println(Thread.currentThread());
    }
}
