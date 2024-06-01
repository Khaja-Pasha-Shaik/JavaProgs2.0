import java.util.Scanner;

public class SumOfN {
    static int sum = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        func7(1,n);
        System.out.println(sum);
    }

    private static void func7(int i, int n) {
        if(i>n){
            return;
        }
        sum += i;
        func7(i+1,n);
    }
}
