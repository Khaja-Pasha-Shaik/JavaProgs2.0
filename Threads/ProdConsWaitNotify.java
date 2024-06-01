package Threads;

import java.util.LinkedList;
import java.util.Queue;
import java.util.List;

public class ProdConsWaitNotify {

    public static void main(String[] args) {

        MyBlockingQueue2<Integer> queue2 = new MyBlockingQueue2<>(16);

        //create producer and consumer threads

        Runnable producer = new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(1000);
                        queue2.put(1);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("Inserted into Q");
                }
            }
        };
        new Thread(producer).start();

        Runnable consumer = new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(1000);
                        queue2.take();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("Taken out from Q. Still i can see not removed...");
                }
            }
        };

        new Thread(consumer).start();

    }

    static class MyBlockingQueue2<E>{
        private Queue<E> queue;
        private int size=1;

        MyBlockingQueue2(int size){
            queue = new LinkedList<>();
        }

        //put
        public synchronized void put(E e) throws InterruptedException {
                //Since we need to stop inserting when queue is full
                while (queue.size() == size) {
                    this.wait();
                }
                queue.add(e);
                this.notifyAll();
        }

        //take
        public synchronized E take() throws InterruptedException {

                //Since we need to stop taking when queue is empty
                while (queue.isEmpty()) {

                        this.wait();

                }
                E item = queue.peek();
                this.notifyAll();
                return item;

        }

        //print
        public List<E> print(){
            return queue.stream().toList();
        }
    }
}
