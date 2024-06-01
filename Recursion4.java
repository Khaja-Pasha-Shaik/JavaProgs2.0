import java.util.Scanner;

public class Recursion4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        func4(n,n);
    }

    private static void func4(int n, int n1) {
        if(n<1){
            return;
        }
        System.out.print(n+" ");
        func4(n-1,n);
    }
}
