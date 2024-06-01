import java.util.Scanner;

public class FibonacciRecursive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int res = fibo(n);
        System.out.println(res);
    }

    private static int fibo(int n) {
        if(n==1){
            return 1;
        } else if (n==0) {
            return 0;
        }
        return fibo(n-1) + fibo(n-2);
    }
}
