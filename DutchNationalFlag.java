import java.util.Arrays;

public class DutchNationalFlag {
    //The array can only contain 0,1,2

    public static void main(String[] args) {
        int[] arr = new int[]{1,1,0,1,2,0,2,1,1,0};

        //Imagine this
        //000000       11111111         0102010112          2222222
        //0   low-1   low    mid-1    mid      high-1     high     n
        //sorting portion is mid to high-1

        int mid =0;
        int low=0;
        int high = arr.length-1;

        while (mid <= high) {
            if(arr[mid] == 0){
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                low++;
                mid++;
            } else if(arr[mid] == 1){
                mid++;
            }
            else {
                int temp = arr[high];
                arr[high] = arr[mid];
                arr[mid] = temp;
                high--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
