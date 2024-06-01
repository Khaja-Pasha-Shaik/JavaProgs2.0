package Threads;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class ProdConsLocksConditions {

    public static void main(String[] args) {
        MyBlockingQueue<Integer> queue = new MyBlockingQueue<>(15);

        Runnable producer = new Runnable() {
            @Override
            public void run() {
                while(true) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    queue.put(1);
                    System.out.println("Inserted in Q");
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
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    queue.take();
                    System.out.println("Taken out from Q");
                }
            }
        };
        new Thread(consumer).start();
    }

    static class MyBlockingQueue<E> {
        //implement add and take methods
        private Queue<E> queue;
        int max =16;
        private ReentrantLock lock = new ReentrantLock(true);
        private Condition notFull = lock.newCondition();
        private Condition notEmpty = lock.newCondition();

        MyBlockingQueue(int size){
            queue = new LinkedList<>();
        }

        public void put(E e)  {
            //only give access to one thread and release after inserting
            lock.lock();
            try {
                //If the queue is full, we have to block the producer thread as it cant write
                while(queue.size() == max){
                    notFull.await();
                }
                queue.add(e);
                //After adding you can tell that Iam not empty anymore
                //Hence adding notify all
                notEmpty.signalAll();
            } catch (InterruptedException ex) {
                throw new RuntimeException(ex);
            } finally {
                lock.unlock();
            }
        }

        public E take(){
            //only give access to one thread and release after the read
            lock.lock();
            try {
                while(queue.size() == 0){
                    notEmpty.await();
                }
                E item = queue.remove();
                notFull.signalAll();
                //Anyways you are removing hence can tell them that you are not full anymore
                return item;
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } finally {
                lock.unlock();
            }
        }
    }
}
