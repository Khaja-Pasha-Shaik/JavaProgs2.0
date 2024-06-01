package Practice;

public class BackTrack1ToN {

    public static void main(String[] args) {
        int n = 10;
        //print 1 to N;
        backTrack1ToN(n);
    }

    private static void backTrack1ToN(int i) {
        if(i<1){
            return;
        }
        backTrack1ToN(i-1);
        System.out.print(i+" ");
    }
}
