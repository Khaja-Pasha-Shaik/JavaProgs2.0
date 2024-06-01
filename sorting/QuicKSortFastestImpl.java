package sorting;

import java.util.Arrays;

public class QuicKSortFastestImpl {

    public static void main(String[] args) {
        int[] arr = new int[]{9,2,34,6,1,8,0,-3,-1};
        //Quick sort usually selects a pivot element (can be any element)
        //Sorts first in such a way that
        //To its left we will have values lesser than it
        //To its right we will have values greater than it
        //TC is O(n*log n)

        quickSort(arr,0,arr.length-1);

        System.out.println(Arrays.toString(arr));
    }

    private static void quickSort(int[] arr, int low, int high) {
        if(low < high){
            int pi = partition(arr,low, high);
            quickSort(arr,low,pi-1);
            quickSort(arr,pi+1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low;
        //Since pivot in the first element in the list
        //The below loop denotes that we are checking in its right obviously since its the 1st element
        for(int j = low+1; j<=high;j++){
            //If any element in its right is lesser than the pivot swap it, so that it comes to its left
            if(arr[j]<pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        //Now if you i exactly stops at the place where our pivot should be
        //Hence swap pivot element with the one at i
        int temp = arr[low];
        arr[low] = arr[i];
        arr[i] = temp;

        return i;
    }
}
