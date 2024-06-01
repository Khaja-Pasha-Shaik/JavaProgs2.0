package Practice;

public class Print1ToNRecursion {

    public static void main(String[] args) {
        int n = 10;
        print1ToNRecursion(1,n);
    }

    private static void print1ToNRecursion(int i, int n) {
        if(i>n){
            return;
        }
        System.out.print(i+" ");
        print1ToNRecursion(i+1,n);
    }
}
