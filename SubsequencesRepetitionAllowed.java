import java.util.ArrayList;
import java.util.List;

public class SubsequencesRepetitionAllowed {

    public static void main(String[] args) {
        int[] arr = new int[]{2,3,6,7,4};
        int target =7;
        // If picked you move to other index, but here we can stay in the same index
        // If you are deciding not to pick - you move ahead to the next index
        List<Integer> ds = new ArrayList<>();
        func13(arr,ds,0,target);
    }

    private static void func13(int[] arr, List<Integer> ds, int i, int target) {
        if(i >= arr.length){
            if(target==0)
                System.out.println(ds);
            return;
        }
        //The below condition needs to be added, because a single element
        //can be greater or equal to the target/remaining target
        //Which might not require any other element addition/same repetition pick
        if(arr[i]<= target) {
            ds.add(arr[i]);
            func13(arr, ds, i, target - arr[i]);
            ds.removeLast();
        }
        //The not pick removal should be in the above condition
        //as we are allowing same element to pick multiple times in the condition above
        //not the new element
        //Hence remove in the condition only
        func13(arr,ds,i+1,target);
    }

    private static int summer2(List<Integer> ds) {
        return ds.stream().mapToInt(Integer::intValue).sum();
    }
}
