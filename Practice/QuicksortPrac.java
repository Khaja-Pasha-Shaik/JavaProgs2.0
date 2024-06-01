package Practice;

import java.util.Arrays;

public class QuicksortPrac {

    public static void main(String[] args) {
        int[] arr = new int[]{9,2,34,6,1,8,0,-3,-1};
        //sorts in such a way that
        //selects a pivot any element
        //then moves all the elements to its left, if lesser than pivot

        quickSort3(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void quickSort3(int[] arr, int low, int high) {
        if(low<high){
            int pi = calculatePartition(arr,low,high);
            quickSort3(arr,low,pi-1);
            quickSort3(arr,pi+1, high);
        }
    }

    private static int calculatePartition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low;
        //find if anything to the right of pivot is greater
        for(int j = low+1;j<=high;j++){
            if(arr[j]<pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        //i is at position wjhere our pivot needs to be
        int temp = arr[low];
        arr[low] = arr[i];
        arr[i] = temp;
        return i;
    }
}
