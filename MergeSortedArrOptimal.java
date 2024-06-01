import java.util.Arrays;

public class MergeSortedArrOptimal {

    //Start one pointer from end of arr1
    //The other pointer from start of arr2
    //Always if arr1[left] is greater than arr2[right] -> then swap
    //Or else break

    public static void main(String[] args) {

        int[] arr1 = new int[]{1,3,5,7};
        int[] arr2 = new int[]{0,2,4,6,8,9};

        int left = arr1.length-1;
        int right = 0;

        while(left >= 0){
            if(arr1[left] > arr2[right]){
                int temp = arr1[left];
                arr1[left] = arr2[right];
                arr2[right] = temp;
                left--;
                right++;
            } else{
                break;
            }
        }
        Arrays.sort(arr1); Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
}
