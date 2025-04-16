package multi_threading;

public class OccureDeadLock {
    final static String s1 = "scale";
    final static String s2 = "pencil";


    public static void main(String[] args) {
        Thread T1 = new Thread()
        {
            public void run()
            {
                synchronized (s1)
                {
                    System.out.println("Thread 1 lock = Resourse 1");

                    synchronized (s2)
                    {
                        System.out.println("Thread 1 lock = Resourse 2");
                    }
                }
            }
        };
      Thread T2 = new Thread()
      {
          public void run()
          {
              synchronized (s2)
              {
                  System.out.println("Thread 2 lock = Resource 2");

                  synchronized (s1)
                  {
                      System.out.println("Thraed 2 lock = Resource 1");
                  }
              }
          }
      };
      T1.start();
      T2.start();
    }
}
