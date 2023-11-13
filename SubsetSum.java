public class SubsetSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 7, 1, 5};
        int s = 10;
        System.out.println(getSubset(arr , s));
    }
    public static boolean getSubset(int[] nums,int target){
        boolean[][] dp = new boolean[nums.length][target+1];
        for (int i = 0; i < nums.length; i++) {
            dp[i][0] = true;
        }
        for(int c = 1 ; c <= target ; c++){
            dp[0][c] = nums[0] == target ? true:false;
        }
        for (int i = 1; i <nums.length ; i++) {
            for (int j = 1; j <= target ; j++) {
                if (dp[i - 1][j]){
                    dp[i][j] = dp[i - 1][j];
                }else if(j >= nums[i]){
                    dp[i][j] = dp[i - 1][j - nums[i]];;
                }
            }
        }
        return dp[nums.length - 1][target];
    }
}
