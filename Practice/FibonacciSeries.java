package Practice;

import java.util.Scanner;
import java.util.stream.IntStream;

public class FibonacciSeries {

    // 0 1 1 2 3 5 8 13 21 34 ...

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        int a = 0;
//        int b = 1;
//        System.out.print(a+" "+b+" ");
//        for(int i=2; i<n; i++){
//            int c = a+b;
//            System.out.print(c+" ");
//            a = b;
//            b = c;
//        }
        //Recursive way is current number is sum of previous 2 numbers
        IntStream.range(0,n).forEach(i -> {
            System.out.print(fibonacciSeries(i)+" ");
        });

    }

    private static int fibonacciSeries(int n) {
        if(n<=1){
            return n;
        }
        return fibonacciSeries(n-1)+fibonacciSeries(n-2);
    }
}
