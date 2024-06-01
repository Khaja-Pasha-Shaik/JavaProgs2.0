package Practice;

public class SequentialThreads {

    static  int n = 10;
    static  int i =1;
    static final Object lock = new Object();


    public static void main(String[] args) {

        Thread t1 = new Thread(new ThreadPrinter(0));
        Thread t2 = new Thread(new ThreadPrinter(1));
        Thread t3 = new Thread(new ThreadPrinter(2));

        t1.start();
        t2.start();
        t3.start();
    }

    static class ThreadPrinter implements Runnable{

        private int threadId;
        ThreadPrinter(int threadId){
            this.threadId = threadId;
        }

        @Override
        public void run() {
            synchronized (lock){
                while (i<n){
                    if(i%3 == threadId){
                        System.out.println(Thread.currentThread().getName()+"-- "+i++);
                        lock.notifyAll();
                    } else{
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
