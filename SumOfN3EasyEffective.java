import java.util.Scanner;

public class SumOfN3EasyEffective {

    public static void main(String[] args) {
        Scanner ssc = new Scanner(System.in);
        int n = ssc.nextInt();
        int res = func9(n);
        System.out.println(res);
    }

    private static int func9(int n) {
        if(n==0){
            return 0;
        }
        return n + func9(n-1);
    }
}
