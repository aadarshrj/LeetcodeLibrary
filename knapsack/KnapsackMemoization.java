package knapsack;

public class KnapsackMemoization {
    public static void main(String[] args) {
        int[] weight = { 2, 3, 1, 4 };
        int[] profits = { 4, 5, 3, 7 };
        int capacity = 5;
        int[][] dp = new int[profits.length][capacity+1];
        System.out.println(findknapsack(weight,profits,capacity,dp));
    }
   private static int findknapsack(int[] weight , int[] profits , int capacity,int[][] dp){
        return knapsack(weight,profits,capacity,dp , 0);
   }
   private static int knapsack(int[] weight , int[] profits , int capacity,int[][] dp,int currentIndex)
   {
       if(capacity <= 0 || currentIndex >= profits.length || weight.length != profits.length){
           return 0;
       }
    if (dp[currentIndex][capacity] != 0){
        return dp[currentIndex][capacity];
    }
    int profit1 = 0, profit2 = 0;
    if (weight[currentIndex] <= capacity){
        profit1 = profits[currentIndex] + knapsack(weight, profits, capacity - weight[currentIndex], dp, currentIndex+1);
    }
    profit2 = knapsack(weight, profits, capacity, dp, currentIndex+1);
    dp[currentIndex][capacity] = Math.max(profit1,profit2);
    return dp[currentIndex][capacity];
   }
}
