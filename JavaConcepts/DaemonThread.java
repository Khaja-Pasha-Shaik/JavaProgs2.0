package JavaConcepts;

public class DaemonThread extends Thread{

    @Override
    public  void run(){
        System.out.println("Daemon thread");
    }

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        DaemonThread dt = new DaemonThread();
        //Always set the daemon thread before starting it
        dt.setDaemon(true);
        dt.start();
    }
}
