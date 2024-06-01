import java.util.Arrays;

public class MoveZeroesInArray {

    public static void main(String[] args) {

        int[] arr = new int[]{0,2,3,0,0,1,5,0,7};

        //Moving zeroes to left
        int j =arr.length-1;
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
        System.out.println(Arrays.toString(arr));

        moveZeroesToRight(arr);
    }

    private static void moveZeroesToRight(int[] arr) {
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        System.out.println("Moving zeroes to right------------");
        System.out.println(Arrays.toString(arr));
    }
}
