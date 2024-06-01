package Practice;

import java.util.ArrayList;
import java.util.List;

public class SubSequences {

    public static void main(String[] args) {
        int[] arr = new int[]{3,1,2};
        //print all the subsequences
        //3,1 | 1,2 | 2,3 X | 1,3 X??
        List<Integer> ds = new ArrayList<>();
        subSequences(arr,ds,0,arr.length);
    }

    private static void subSequences(int[] arr, List<Integer> ds, int ind, int len) {
        if(ind >= len){
            System.out.println(ds);
            return;
        }
        //pick
        ds.add(arr[ind]);
        subSequences(arr,ds, ind +1, len);

        //not pick
        ds.removeLast();
        subSequences(arr,ds,ind+1,len);

    }
}
