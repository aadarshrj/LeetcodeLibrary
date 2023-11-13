import java.util.LinkedList;
import java.util.List;

public class CountSubsetSum {
    public static void main(String[] args) {
    List my = new LinkedList<>();
    }
    public int recursiveCount(int[] nums , int target , int[][] dp , int index){
        if(target == 0){
            return 1;
        }
        if (nums.length == 0 || index >= nums.length){
            return 0;
        }

        if (dp[index][target] == -1){
            int sum1 = 0;
            if (nums[index] <= target){
                sum1 = recursiveCount(nums, target - nums[index], dp, index+1);
            }
            int sum2 = recursiveCount(nums, target, dp, index+1);
            dp[index][target] = sum1 + sum2;
        }
    return dp[nums.length - 1][target];
    }
}
