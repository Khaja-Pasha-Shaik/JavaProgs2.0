package Practice;

public class StockPrice {

    public static void main(String[] args) {
        int[] arr =new int[]{7,1,5,3,6,10,4};

        //previous min -> when to buy
        //current max -> if I can sell whats the profit
        int mini = arr[0];
        int maxProfit = 0;
        for(int i=1;i<arr.length;i++){
            int profit = arr[i] - mini;
            maxProfit = Math.max(maxProfit, profit);
            mini = Math.min(mini, arr[i]);
        }
        System.out.println(maxProfit);
    }
}
