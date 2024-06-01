package JavaConcepts;

public class ThreadJoin extends Thread{

    static Thread thread;

    @Override
    public  void run(){
        try {
            //I will wait till main thread completes execution
            thread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        for (int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+"--"+i);
        }
    }

    public static void main(String[] args){
        thread = Thread.currentThread();
        ThreadJoin tj = new ThreadJoin();
        tj.start();
        for(int j=0;j<10;j++){
            System.out.println(Thread.currentThread().getName()+"=="+j);
        }
    }
}
