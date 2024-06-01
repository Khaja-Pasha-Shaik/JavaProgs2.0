package InterviewQues;

public class LongestIncreasingSubsequence {

    public static void main(String[] args) {

        int[] arr = new int[]{10, 22, 9, 33, 21, 50, 41, 60};
        int res = calculateLIS2(arr,0,-1);
        System.out.println(res);
    }

    private static int calculateLIS2(int[] arr, int ind, int prev) {
        int len = 0;
        if(ind == arr.length){
            return 0;
        }

        //not pick
        len = 0 + calculateLIS2(arr,ind+1, prev);

        //pick only if greater than previous
        if(prev == -1 || arr[ind] > arr[prev])
            len = Math.max(len,1 + calculateLIS2(arr, ind+1, ind));

        return len;
    }
}
