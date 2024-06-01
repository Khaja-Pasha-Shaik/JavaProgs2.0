package JavaConcepts;

public class ThreadCreationRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("Threads Task");
    }

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        ThreadCreationRunnable tcr = new ThreadCreationRunnable();
        Thread t = new Thread(tcr);
        t.start();
    }
}
