package Practice;

import java.util.HashMap;

public class TwoSummation {

    public static void main(String[] args) {
        int[] arr = new int[]{2,3,7,4,8};
        int target =11;

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j] == target){
                    System.out.println(arr[i]+", "+arr[j]);
                }
            }
        }

        //This is O(n^2), whats shown above
        //we can do it in O(N) if we store the delta every time into a map

        HashMap<Integer, Integer> map = new HashMap<>();
        //find diff of target with every element, so thats whats needed to complete the target
        //So before insertion, we will check if we already that diff equivalent number
        //since we need index, we will store diff and index

        for(int i=0;i< arr.length;i++){
            int delta = target-arr[i];
            if(map.containsKey(delta)){
                System.out.println(map.get(delta)+", "+arr[i]);
            }
            map.put(arr[i],arr[i]);
        }
    }
}
