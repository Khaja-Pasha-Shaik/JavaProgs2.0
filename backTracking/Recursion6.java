package backTracking;

import java.util.Scanner;

public class Recursion6 {
    //Print n to 1
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        func6(1,n);
    }

    private static void func6(int i, int n) {
        if(i>n){
            return;
        }
        func6(i+1,n);
        System.out.print(i+" ");
    }
}
