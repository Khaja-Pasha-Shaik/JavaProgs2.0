package backTracking;

import java.util.Scanner;

public class Recursion5 {
    //Print linearly from 1 to n using back track
    //back track means print it after the function call
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        func5(n,n);
    }

    private static void func5(int n, int n1) {
        if(n<1){
            return;
        }
        func5(n-1,n1);
        System.out.print(n+" ");
    }
}
