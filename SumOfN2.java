import java.util.Scanner;

public class SumOfN2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        func8(n,0);
    }

    private static void func8(int n, int sum) {
        if(n<1){
            System.out.println(sum);
            return;
        }
        func8(n-1, sum+n);
    }
}
