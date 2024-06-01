package Practice;

import java.util.ArrayList;
import java.util.List;

public class New1 {
    // 1 to N
    public static void main(String[] args) {
        int[] arr = new int[]{3,1,2};
        int target = 7;
        //print all subsequences
        //pick and not pick methodology and we will maintain a data structure
        List<Integer> ds = new ArrayList<>();
        func(arr,0,ds,target);
    }

    private static void func(int[] arr, int i, List<Integer> ds, int target) {
        if(i>arr.length-1){
            if(target==0)
                System.out.println(ds);
            return;
        }
        //pick - can pick multiple times
        //add condition that if element is exceeding target
        if(arr[i]<=target) {
            ds.add(arr[i]);
            func(arr, i, ds, target - arr[i]);
            //not pick
            ds.removeLast();
        }
        func(arr,i+1,ds, target);
    }

}
