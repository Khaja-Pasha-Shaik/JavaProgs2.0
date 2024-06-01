package JavaConcepts;

public class ThreadCreation extends Thread{

    @Override
    public void run(){
        for(int i=0; i<10;i++) {
            System.out.println("Threads task");
        }
    }

    public static void main(String[] args) {
        for(int j=0; j<10;j++) {
            System.out.println("Main threads task");
        }
        ThreadCreation tc = new ThreadCreation();
        tc.start();
    }
}
