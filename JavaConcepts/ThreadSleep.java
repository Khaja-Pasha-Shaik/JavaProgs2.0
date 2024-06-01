package JavaConcepts;

public class ThreadSleep extends Thread{

    @Override
    public void run(){
        for(int i=0; i<5; i++){
            try {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName()+"- "+i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        ThreadSleep ts = new ThreadSleep();
        ts.start();
    }
}
