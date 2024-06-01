import java.util.Arrays;
import java.util.Scanner;

public class ReverseArrayRecursive {

    public static void main(String[] args) {
        int[] arr = new int[]{0,1,2,3,4,2,0};
        //To reverse an array we can have 2 pointer
        //one at start and the other at end
        //swap and incr left pointer and decr right pointer
        //So task of recursive func is swap and incr/decr pointers
        func10(arr,0,arr.length-1);
        Arrays.stream(arr).forEach(a -> System.out.print(a+" "));
    }

    private static void func10(int[] arr, int l, int r) {
        //swap logic
        if(l>=r){
            return;
        }
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
        func10(arr,l+1,r-1);
    }
}
