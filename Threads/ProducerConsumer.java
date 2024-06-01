package Threads;


import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumer {

    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(1);

        //If you take BlockingQueue - everything is handled by that only
        //No need to apply any logic
        //Just take 2 threads name one as producer, one as consumer
        //Producer make it insert into the queue (queue.put)
        //Consumer make it take out of the queue (queue.take)
        //So the consumer will wait till the producer inserts something in the queue
        //And if queue is full the producer will wait for consumer to take something out of the queue
        //This will run as an infinite loop. Because 2 threads are always working
        //One to fill and one to remove
        //How to prove - Consumer is consuming only after producer is inserting??
         // Just dont start the producer thread, the consumer wont be printing anything

        //How to prove - Producer is inserting only after consumer is taking the element out
        //Make your queue size to 1
        //Now on the consumer thread, instead of take() apply peek() method - this wont remove from queue
        //If you check the output, the producer thread will not be inserting anything
        //since it is already full and its not taken out

        Runnable producer = new Runnable() {
            @Override
            public void run() {
                while (true){
                    try {
                        Thread.sleep(1000);
                        queue.put(1);
                        System.out.println("Inserted into Queue");
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        };
        new Thread(producer).start();
//        new Thread(producer).start();

        Runnable consumer = new Runnable() {
            @Override
            public void run() {
                while(true){
                    try {
                        Thread.sleep(1000);
                        Integer i = queue.peek();
                        System.out.println("Taken out from Queue");
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        };
        new Thread(consumer).start();
//        new Thread(producer).start();
    }
}
