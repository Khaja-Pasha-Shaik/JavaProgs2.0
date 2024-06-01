package JavaConcepts;

public class ThreadYield extends Thread{

    @Override
    public void run(){
        Thread.yield();
        for (int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+"--"+i);
        }
    }

    public static void main(String[] args) {
//        Thread.yield();
        ThreadYield ty = new ThreadYield();
        ty.start();
        for(int j=0;j<10;j++){
            System.out.println(Thread.currentThread().getName()+"=="+j);
        }
    }
}
