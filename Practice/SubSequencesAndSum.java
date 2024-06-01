package Practice;

import java.util.ArrayList;
import java.util.List;

public class SubSequencesAndSum {

    public static void main(String[] args) {
        int[] arr = new int[]{3,1,2};
        int target = 3;
        List<Integer> ds = new ArrayList<>();
        subSequencesAndSum(arr,ds,0,target);
    }

    private static void subSequencesAndSum(int[] arr, List<Integer> ds, int ind, int target) {
        if(ind>=arr.length){
            if(summer(ds) == target){
                System.out.println(ds);
            }
            return;
        }
        //pick
        ds.add(arr[ind]);
        subSequencesAndSum(arr,ds,ind+1,target);

        //not pick
        ds.removeLast();
        subSequencesAndSum(arr,ds,ind+1, target);
    }

    private static int summer(List<Integer> ds) {
        return ds.stream().mapToInt(Integer::intValue).sum();
    }
}



