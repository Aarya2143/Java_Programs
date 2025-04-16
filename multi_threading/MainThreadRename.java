package multi_threading;

public class MainThreadRename {
    public static void main(String[] args) {
        Thread obj = Thread.currentThread();
        System.out.println("Actual object is: "+obj);
        System.out.println("object thread name is : "+obj.getName());
        obj.setName("NewObj");
        System.out.println("Rename object is : "+obj);
        System.out.println("rename thread name is: "+obj.getName());
    }
}
