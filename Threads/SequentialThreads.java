package Threads;

public class SequentialThreads {

    //Print numbers using 3 threads
    static int max=10;
    static int n;
    static final Object lock = new Object();

    public static void main(String[] args) {
        Thread t1 = new Thread(new Printer(0,1));
        Thread t2 = new Thread(new Printer(1,2));
        Thread t3 = new Thread(new Printer(2,3));

        t1.start();
        t2.start();
        t3.start();
    }

    static class Printer implements Runnable{
        private int threadId;
        private int numToPrint;

        Printer(int threadId, int numToPrint){
            this.threadId = threadId;
            this.numToPrint = numToPrint;
        }

        @Override
        public void run() {
            while(n<max){
                synchronized (lock){
                    if(n%3 == threadId){
                        System.out.println("Thread :: "+threadId+"  prints  ::"+n);
                        n++;
                        lock.notifyAll();
                    } else {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
            }
        }
    }
}
