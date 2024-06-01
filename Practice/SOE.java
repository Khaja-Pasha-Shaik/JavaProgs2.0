package Practice;

import java.util.Arrays;

public class SOE {

    public static void main(String[] args) {
        int n=30;
        int c=0;
        for(int i=1;i<=n;i++){
            c=0;
            for(int j=1;j<=i;j++){
                if(i%j == 0){
                    c += 1;
                }
            }
            if(c==2){
                System.out.print(i+"  ");
            }
        }

        //take boolean array
        boolean[] isPrime = new boolean[n+1];
        Arrays.fill(isPrime, true);

        for(int i=2;i<=n;i++){
            for(int j=i*i;j<=n;j=j+i){
                if(isPrime[j]){
                    isPrime[j] = false;
                }
            }
        }
        System.out.println("**************************");
        for(int i=2;i<isPrime.length;i++){
            if(isPrime[i])
                System.out.print(i+"  ");
        }
    }
}
