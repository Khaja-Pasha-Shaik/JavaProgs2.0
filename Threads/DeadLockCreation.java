package Threads;

public class DeadLockCreation{

    public static void main(String[] args) {
        //Deadlock is situation where one thread waits for other to release the lock
        // And the other waits for this thread to release the lock

        //For this we need 2 resources
        Object resource1 = new Object();
        Object resource2 = new Object();

        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (resource1){
                    System.out.println("Thread-0 got hold of resource1");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("Thread-0 also waiting to hold onto resource-2");
                    synchronized (resource2){
                        System.out.println("Thread-0 got hold of resource2");
                    }
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (resource2){
                    System.out.println("Thread-1 got hold of resource2");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("Thread-1 also waiting to hold onto resource-1");
                    synchronized (resource1){
                        System.out.println("Thread-1 got hold of resource2");
                    }
                }
            }
        }).start();
    }

}