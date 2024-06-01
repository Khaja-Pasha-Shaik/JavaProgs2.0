package Practice;

public class EvenOddThreadPrinter {
    static int n =10;
    static int i = 1;

    public static void main(String[] args) {

        EvenOddThreadPrinter eo = new EvenOddThreadPrinter();

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    eo.printEvenNums();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    eo.printOddNums();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();

    }

    private void printOddNums() throws InterruptedException {
        synchronized (this){
            while (i<n){
                if(i%2==0){
                    wait();
                }
                System.out.println(Thread.currentThread().getName()+"-- "+i++);
                notify();
            }
        }
    }

    private void printEvenNums() throws InterruptedException {
        synchronized (this){
            while (i<n){
                if(i%2 != 0){
                    wait();
                }
                System.out.println(Thread.currentThread().getName()+"-- "+i++);
                notify();
            }
        }
    }

}
