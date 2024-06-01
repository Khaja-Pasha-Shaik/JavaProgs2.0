package Practice;

import java.util.Arrays;

public class SortEvenOddinArray {

    //Sort the even and odd in an Array
    //Dont use extra space
    //Steps:
    //1. make the segregate so that even comes to first part
    //2. Odd goes to second part (Can be done by pointers)
    //3. Then sort those 2 subarrays

    public static void main(String[] args) {

        int[] arr = new int[]{4,5,2,1,8,7,3,9,13};

        int left = 0;
        int right = arr.length-1;

        while(left<right){

            while (arr[left]%2 == 0 && left<right){
                left++;
            }
            while (arr[right]%2 != 0 && left<right){
                right--;
            }
            if(left<right){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(left+", "+right);
        //left is always being at starting point of odd array
        Arrays.sort(arr,0,left);
        Arrays.sort(arr,left+1,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
