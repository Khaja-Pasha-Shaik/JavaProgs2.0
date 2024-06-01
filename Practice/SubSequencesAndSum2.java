package Practice;

import java.util.ArrayList;
import java.util.List;

public class SubSequencesAndSum2 {

    public static void main(String[] args) {
        int[] arr = new int[]{3,1,2};
        int target = 5;
        List<Integer> ds = new ArrayList<>();
        subSequencesAndSum2(arr,ds,0,target);
    }

    private static void subSequencesAndSum2(int[] arr, List<Integer> ds, int ind, int target) {
        if(ind >= arr.length){
            if(target==0)
                System.out.println(ds);
            return;
        }
        if(arr[ind]<=target){
            //pick
            ds.add(arr[ind]);
            subSequencesAndSum2(arr,ds,ind,target-arr[ind]);
            //not pick
            ds.removeLast();
        }
        subSequencesAndSum2(arr,ds,ind+1,target);
    }
}
