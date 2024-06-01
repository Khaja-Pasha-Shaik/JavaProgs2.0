package Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ArrSubSequence {

    public static void main(String[] args) {
        int[] arr = new int[]{3,1,2};
        int target = 5;
        List<Integer> ds = new ArrayList<>();
        getChangeForCoins(arr,target,ds,0);
    }

    private static void getChangeForCoins(int[] arr, int target, List<Integer> ds, int ind) {
        if(ind == arr.length){
            if(target == 0)
                System.out.println(ds);
            return;
        }

        if(arr[ind] <= target) {
            //take case
            //no limit on picking element
            ds.add(arr[ind]);
            getChangeForCoins(arr, target-arr[ind], ds, ind);

            ds.removeLast();
        }
        getChangeForCoins(arr,target,ds,ind+1);
    }


}
