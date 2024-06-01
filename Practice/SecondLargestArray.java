package Practice;

public class SecondLargestArray {

    public static void main(String[] args) {
        int[] arr = new int[]{8,19,6,2,3,9,0};
        int secondHigh = 0;
        int firstHigh = arr[0];

        for(int i=1;i<arr.length;i++){
            if(arr[i]>firstHigh){
                secondHigh = firstHigh;
                firstHigh = arr[i];
            }
            if(arr[i]>secondHigh && arr[i]<firstHigh){
                secondHigh = arr[i];
            }
        }
        System.out.println(secondHigh);
    }
}
