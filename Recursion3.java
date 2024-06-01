import java.util.Scanner;

public class Recursion3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        func3(1,n);
    }

    private static void func3(int i, int n) {
        if(i>n){
            return;
        }
        System.out.print(i+" ");
        func3(i+1,n);
    }
}
