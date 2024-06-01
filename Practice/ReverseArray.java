package Practice;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {
        int[] arr = new int[]{3,2,5,1,9,6};
        int l = 0;
        int r = arr.length-1;

//        while (true){
//            if(l>=r){
//                Arrays.stream(arr).forEach(e -> System.out.print(e+" "));
//                break;
//            }
//            int temp = arr[l];
//            arr[l] = arr[r];
//            arr[r] = temp;
//            l++;
//            r--;
//        }

        //Recursive code
        reverseArray(arr,l,r);
    }

    private static void reverseArray(int[] arr, int l, int r) {
        if(l>=r){
            Arrays.stream(arr).forEach(e -> System.out.print(e+" "));
            return;
        }
        //swap logic
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
        reverseArray(arr,l+1, r-1);
    }
}
