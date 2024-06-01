package Practice;

import java.util.Arrays;

public class SieveOfErathosthenes {

    public static void main(String[] args) {
        int n = 30;
//        int count = 0;
//        for(int i=1;i<=n;i++){
//            count =0;
//            for(int j=2;j<i;j++){
//                if(i%j == 0){
//                    count++;
//                }
//            }
//            if(count==0){
//                System.out.print(i+" ");
//            }
//        }

        boolean[] isPrime = new boolean[n];
        Arrays.fill(isPrime, true);

        for (int i=2;i<=n;i++){
            for(int j = i*i; j<n;j += i){
                //If we have 2 we will mark 4,6,8,10.. as not primes
                if(isPrime[j]){
                    isPrime[j] = false;
                }
            }
        }

        for(int k=2; k<isPrime.length;k++){
            if(isPrime[k]){
                System.out.print(k+" ");
            }
        }
    }
}
