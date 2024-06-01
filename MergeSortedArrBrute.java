import java.util.Arrays;

public class MergeSortedArrBrute {

    public static void main(String[] args) {
        int[] arr1 = new int[]{1,3,5,7};
        int[] arr2 = new int[]{0,2,4,6,8,9};
        int[] arr3 = new int[arr1.length+arr2.length];

        int left =0;
        int right = 0;
        int ind = 0;
        while (left < arr1.length && right < arr2.length){
            if(arr1[left] < arr2[right]){
                arr3[ind] = arr1[left];
                ind++; left++;
            }
            else{
                arr3[ind] = arr2[right];
                ind++; right++;
            }
        }
        while (left < arr1.length){
            arr3[ind] = arr1[left];
            left++;
            ind++;
        }
        while (right < arr2.length){
            arr3[ind] = arr2[right];
            right++;
            ind++;
        }

        for(int i=0;i<arr3.length;i++){
            if(i < arr1.length){
                arr1[i] = arr3[i];
            } else{
                arr2[i-arr1.length] = arr3[i];
            }
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
}
