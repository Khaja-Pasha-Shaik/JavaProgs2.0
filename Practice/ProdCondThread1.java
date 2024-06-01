package Practice;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProdCondThread1 {

    public static void main(String[] args) {

        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(1);

        Runnable producer = () -> {
            while (true) {
                try {
                    Thread.sleep(1000);
                    queue.put(1);
                    System.out.println("Inserted into Q");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Thread t1 = new Thread(producer);
        t1.start();

        Runnable consumer = new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(2000);
                        queue.take();
                        System.out.println("Taken out of Q");
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        };

        Thread t2 = new Thread(consumer);
        t2.start();
    }
}
