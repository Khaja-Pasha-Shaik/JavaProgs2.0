package Threads;

public class EvenOddPrinterThreads {

    int max = 10;
    int n=1;

    public static void main(String[] args) {
        EvenOddPrinterThreads eo = new EvenOddPrinterThreads();
        Thread t1 = new Thread(() -> {
            try {
                eo.printEvenNumbers();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        Thread t2 = new Thread(() -> {
            try {
                eo.printOddNumbers();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        t1.start();
        t2.start();
    }

    private void printOddNumbers() throws InterruptedException {
        synchronized (this){
            while(n<max){
                while(n%2==0){
                    wait();
                }
                System.out.println(Thread.currentThread().getName()+" -- "+n++);
                notify();
            }
        }
    }

    private void printEvenNumbers() throws InterruptedException {
        synchronized (this) {
            while (n < max) {
                while (n % 2 != 0) {
                    wait();
                }
                System.out.println(Thread.currentThread().getName() + " -- " + n++);
                notify();
            }
        }
    }
}
