package Practice;

import java.util.Scanner;

public class FactorialOfN {

    //factorial is nothing but n*(n-1)

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = factorialOfN(n);
        System.out.println(res);
    }

    private static int  factorialOfN(int n) {
        //base condition
        if(n<=1){
            return 1;
        }
        return n*factorialOfN(n-1);
    }
}
