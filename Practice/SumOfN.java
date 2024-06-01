package Practice;

public class SumOfN {

    public static void main(String[] args) {
        int n = 10;
        // n+(n-1)
        int res = sumOfN(n);
        System.out.println(res);
    }

    private static int sumOfN(int n) {
        if(n == 0){
            return 0;
        }
        return n + sumOfN(n-1);
    }
}
