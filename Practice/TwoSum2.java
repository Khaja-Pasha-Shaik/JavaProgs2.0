package Practice;

import java.util.HashMap;
import java.util.Map;

public class TwoSum2 {

    public static void main(String[] args) {
        int[] arr = new int[]{2,3,4,6,7,1,8};
        int target = 10;
        //Brute
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j] == target){
                    System.out.println(arr[i]+", "+arr[j]);
                }
            }
        }
        System.out.println("------------------------------------------------");
        Map<Integer, Integer> map = new HashMap<>(); //store (value, index)
        for(int i=0;i<arr.length;i++){
            int delta = target - arr[i];
            if(!map.containsKey(arr[i])){
                map.put(delta, arr[i]);
            } else{
                System.out.println(arr[i]+", "+ map.get(arr[i]));
            }
        }
    }
}
