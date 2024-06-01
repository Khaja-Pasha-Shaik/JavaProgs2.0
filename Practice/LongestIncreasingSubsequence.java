package Practice;

public class LongestIncreasingSubsequence {

    public static void main(String[] args) {
        int[] arr = new int[]{10,9,2,5,3,7,101,18};

        int res = calculateLIS(arr,0,-1);
        System.out.println(res);

    }

    private static int calculateLIS(int[] arr, int ind, int prevInd) {
        //base case
        if(ind == arr.length){
            return 0;
        }
        //not pick case, length will not increase
        //Lets say you dont pick 9 after 10, the prevInd will remain same and length will not increase
        int len = 0+ calculateLIS(arr,ind+1, prevInd);

        //pick case
        //You only pick if arr[ind] is greater than prevInd element
        if( prevInd == -1 || arr[ind] > arr[prevInd]){
            len = Math.max(len, 1+calculateLIS(arr,ind+1, ind));
        }
        return len;
    }
}
