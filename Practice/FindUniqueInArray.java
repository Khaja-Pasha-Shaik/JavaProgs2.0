package Practice;

import java.util.Arrays;

public class FindUniqueInArray {
    //This only works in a sorted array
    public static void main(String[] args) {
        int[] arr = new int[]{1,1,2,2,3,3,3,1,1,1,4,1,1,5,2,2,2};
        int i=0;
        for(int j=1;j<arr.length;j++){
            //Condition to check if its unique
            if(arr[j] != arr[i]){
                //if unique, let it occupy the position beside your previous unique
                arr[i+1] = arr[j];
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
