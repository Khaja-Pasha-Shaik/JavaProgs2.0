package InterviewQues;

import java.util.HashMap;
import java.util.Map;

public class SummationTwo{
    public static void main(String[] args) {
        int[] arr = new int[]{2,3,7,4,8};
        int target =6;
        //Brute approach
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println("("+i+", "+j+")");
                    break;
                }
            }
        }

        //Optimised approach
        //use map
        //store the diff with the current element with
        //diff means - this is the remaining what I need to reach target
        //So for every insertion into map - you will see do I have this
        //If you are having - get current iteration(i)
        //And the value of that contains - since we store in map
        // <diff, index>

        Map<Integer, Integer> map =  new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(!map.containsKey((target-arr[i]))){
                map.put(arr[i],i);
            } else {
                System.out.println(map.get(target-arr[i])+"-- "+i);
            }
        }
    }
}