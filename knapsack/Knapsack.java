package knapsack;

public class Knapsack {
    public static void main(String[] args) {
        int[] weight = { 2, 3, 1, 4 };
        int[] profits = { 4, 5, 3, 7 };

        int capacity = 5;
        System.out.println(findknapsack(weight,profits,capacity));
    }
    private static int findknapsack(int[] weight ,int[] profits , int capacity){
        return knapsackrecursive(weight , profits , capacity , 0);
    }
    private static int knapsackrecursive(int[] weight , int[] profits , int capacity , int currentIndex){
        //base checking
        if (capacity <= 0 || currentIndex >= profits.length){
            return 0;
        }
        int profit = 0;
        if(weight[currentIndex] <= capacity){
            profit = profits[currentIndex] + knapsackrecursive(weight, profits, capacity - weight[currentIndex], currentIndex+1);
        }
       int profit2 = knapsackrecursive(weight, profits, capacity , currentIndex+1);

       return Math.max(profit , profit2);
    }
}
