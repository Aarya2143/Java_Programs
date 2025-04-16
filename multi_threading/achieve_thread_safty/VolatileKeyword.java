package multi_threading.achieve_thread_safty;

public class VolatileKeyword extends Thread {
    static volatile int turn = 1;
    int myTurn;

    public VolatileKeyword(String name, int myTurn) {
        this.setName(name);
        this.myTurn = myTurn;
    }

    public static void main(String[] args) {
       VolatileKeyword thread1 = new VolatileKeyword("Ramesh", 1);
       VolatileKeyword thread2 = new VolatileKeyword("Suresh", 2);
       VolatileKeyword thread3 = new VolatileKeyword("Kamlesh", 3);

        thread1.start();
        thread2.start();
        thread3.start();
    }

    @Override
    public void run()
    {
        for (int i = 0; i <= 3; i++)
        {
            System.out.println(Thread.currentThread().getName() + " and index is " + i);
        }

        turn++;
    }
}




