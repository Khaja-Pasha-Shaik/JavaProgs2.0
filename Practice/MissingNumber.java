package Practice;

public class MissingNumber {

    public static void main(String[] args) {

        int[] arr = new int[]{8,1,2,7,6,4,5};

        int x1 = arr[0];
        int x2 = 1;

        for(int i=1;i<arr.length;i++){
            x1 = x1 ^ arr[i];
        }

        for(int i=2;i<=arr.length+1;i++){
            x2 = x2 ^ i;
        }

        System.out.println(x1^x2);
    }
}
