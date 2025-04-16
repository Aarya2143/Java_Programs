package multi_threading;

public class Practice extends Thread
{
    public static void main(String[] args) {
        Practice thread1 = new Practice();
        thread1.setName("Aarya");

        Practice thread2 = new Practice();
        thread2.setName("nikita");

        Practice thread3 = new Practice();
        thread3.setName("pragati");

        thread1.start();
        thread2.start();
        thread3.start();
    }

    @Override
    public void run() {
      synchronized (Practice.class) {
            for (int i = 0; i <= 3; i++) {
                System.out.println(Thread.currentThread().getName() + " and index is: " + i);
            }
        }
    }
}
