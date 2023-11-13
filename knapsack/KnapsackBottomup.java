package knapsack;

public class KnapsackBottomup {

    private static int solveKnapsack(int[] weights , int[] profits , int capacity){
        if(capacity <= 0 || profits == null || profits.length == 0 || profits.length != weights.length){
            return 0;
        }
        int dp[][] = new int[profits.length][capacity+1];

        for (int i = 0; i < profits.length ; i++) {
            dp[i][0] = 0;
        }
        //if we have one weight only.
        for (int c = 0; c <= capacity ; c++) {
            if (weights[0] <= c) dp[0][c] = weights[0];
        }
        for (int i = 1; i < profits.length; i++) {
            for (int c = 0; c <= capacity ; c++) {
                int profit1 = 0, profit2 = 0 ;
                if (weights[i] <= c){
                    profit1 = profits[i] + dp[i - 1][c - weights[i]];
                }
                profit2 = dp[i - 1][c];
                dp[i][c] = Math.max(profit1 , profit2);
            }
        }
        return dp[profits.length - 1][capacity];
    }
}
