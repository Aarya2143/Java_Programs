package multi_threading;

public class DefaultThread {
    public static void main(String[] args) {
        Thread obj = Thread.currentThread();
        System.out.println("name : "+ obj.getName());
        System.out.println(obj);
    }
}
