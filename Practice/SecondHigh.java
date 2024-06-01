package Practice;

import java.util.TreeSet;
import java.util.stream.IntStream;

public class SecondHigh {

    public static void main(String[] args) {

        int[] arr = new int[]{2,1,2,0,1};
        TreeSet<Integer> ts = new TreeSet<>();
        for(int i=0;i<arr.length;i++){
            ts.add(arr[i]);
        }
        System.out.println(ts.toArray()[ts.size()-2]);
    }
}
