package Practice;

import java.util.Arrays;

public class TwoArraySort {

    public static void main(String[] args) {
        int[] arr1 = new int[]{3,5,6,2};
        int[] arr2 = new int[]{1,7,9};

        for(int i=0;i<arr2.length;i++){
            if(arr1[i]<arr2[i]){
                int temp = arr1[i];
                arr1[i] = arr2[i];
                arr2[i] = temp;
            }
        }

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
}
