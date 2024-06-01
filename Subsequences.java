import java.util.ArrayList;
import java.util.List;

public class Subsequences {
    //A subsequence is something which can be continuous or non continuous
    // [3,1,2]
    // [3,1], [1,2], [3],..... are continuos
    // [3,2] can also be subsequence, but non - continuous
    // So at each index we can have the logic to take it or not take it
    // Taking it will create one subsequence, not taking it will create one more

    public static void main(String[] args) {
        int[] arr = new int[]{3,1,2};
        int sum=3;
        List<Integer> ds = new ArrayList<>();
        func12(arr,ds,0, arr.length,sum);
    }

    private static void func12(int[] arr, List<Integer> ds, int ind, int n, int sum) {
        if(ind>=n){
            if(summer(ds)==sum){
                System.out.println(ds);
            }
//            System.out.println(ds);
            return;
        }
        //Take the index
        ds.add(arr[ind]);
        func12(arr, ds, ind+1,n, sum);

        //Not take
        ds.removeLast();
        func12(arr,ds, ind+1,n, sum);
    }

    private static int summer(List<Integer> ds) {
        return ds.stream().mapToInt(Integer::intValue).sum();
    }
}
