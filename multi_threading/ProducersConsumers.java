package multi_threading;

import java.util.LinkedList;

public class ProducersConsumers {
    public void main(String[] args) throws InterruptedException {
                                                    // Object of a class that has both produce() and consume() methods
        PC pc = new PC();
                                                    // Create producer thread
        Thread t1 = new Thread(new Runnable()
        {
            @Override
            public void run() {
                try {
                    pc.produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

                                                      // Create consumer thread
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pc.consume();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // Start both threads
        t1.start();
        t2.start();

        // t1 finishes before t2
        t1.join();
        t2.join();
    }

    // This class has a list, producer (adds items to list
    // and consumer (removes items).
     class PC {

        // Create a list shared by producer and consumer
        // Size of list is 5
        LinkedList<Integer> list = new LinkedList<>();
        int capacity = 0;

        // Function called by producer thread
        public void produce() throws InterruptedException {
            int value = 0;
            while (true) {
                synchronized (this) {
                    // producer thread waits while list is full
                    while (list.size() == capacity){
                       // System.out.println("Producer is in waiting state");
                        wait();
                    }

                    System.out.println("Producer produced-" + value);
                    list.add(value++);


                    // to insert the jobs in the list


                    // notifies the consumer thread that now it can start consuming

                  notify();
                    // makes the working of program easier to understand
                    Thread.sleep(1000);
                }
            }
        }

        // Function called by consumer thread
        public void consume() throws InterruptedException {
            while (true) {
                synchronized (this) {
                    // consumer thread waits while list
                    // is empty
                    while (list.size() == 0){
                    //   System.out.println("Consumer is in waiting state");
                        wait();
                    }

                    int val = list.removeFirst();
                    System.out.println("Consumer consumed-" + val);



                    // to retrieve the first job in the list




                    // Wake up producer thread

                   notify();
                    // and sleep
                    Thread.sleep(1000);
                }
            }
        }
    }
}
