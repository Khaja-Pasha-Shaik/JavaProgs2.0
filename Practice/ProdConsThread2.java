package Practice;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

public class ProdConsThread2 {

    static class MyQueueBlocking<E>{

        int size;
        Queue<E> queue;

        MyQueueBlocking(int size){
            queue = new LinkedList<>();
            this.size = size;
        }

        //put method
        public synchronized void put(E e) throws InterruptedException {
            //check size and stop inserting once max is reached
            while (queue.size() == size){
                this.wait();
            }
            queue.add(e);
            this.notifyAll();
        }

        //take method
        public synchronized void take() throws InterruptedException {
            while (queue.size()==0){
                this.wait();
            }
            queue.remove();
            this.notifyAll();
        }

        public synchronized E peek(){
            return queue.peek();
        }
    }

    public static void main(String[] args) {
        MyQueueBlocking<Integer> queue = new MyQueueBlocking<>(1);

        Runnable producer = new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(1000);
                        System.out.println("Inserted to Q");
                        queue.put(1);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
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
                        Thread.sleep(1000);
                        queue.peek();
                        System.out.println("Taken from Q");
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
