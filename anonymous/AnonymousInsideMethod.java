package anonymous;

public class AnonymousInsideMethod {
    public static void main(String[] args) {
        Thread obj = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Anonymous class inside the main method");
            }
        });
        obj.start();
    }
}
