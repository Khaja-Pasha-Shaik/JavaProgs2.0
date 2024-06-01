package Practice;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] arr = new int[]{9,2,34,6,1,8,0,-3,-1};

        quickSort2(arr,0,arr.length-1);

        System.out.println(Arrays.toString(arr));
    }

    private static void quickSort2(int[] arr, int low, int high) {
        if(low < high){
            int pi = partition2(arr, low, high);
            quickSort2(arr, low, pi-1);
            quickSort2(arr, pi+1, high);
        }
    }

    private static int partition2(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low;
        //since pivot is first element only
        //we need to check to its right if it has any elements smaller than it
        //if so - swap them
        for(int j = low+1; j<=high;j++){
            if(arr[j]<pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        //Now i is at the position where the pivot should actually be
        //pivot is at arr[low], hence swap arr[i] and arr[low]
        int temp = arr[i];
        arr[i] = arr[low];
        arr[low] = temp;
        return i;
    }

}
