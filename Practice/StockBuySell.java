package Practice;

public class StockBuySell {

    public static void main(String[] args) {
        int[] arr =new int[]{7,1,5,3,14};
        int maxProfit = 0;
        int mini = arr[0];
        for(int i=1;i<arr.length;i++){
            int profit = arr[i] - mini;
            maxProfit = Math.max(maxProfit, profit);
            mini = Math.min(mini,arr[i]);
        }
        System.out.println(maxProfit);
    }
}
