package AlgoPatterns.slidingWindow;

public class SmallestSubarray {

    public static int getSum(int[] arr , int s){
        int windowStart = 0;
        int sum = 0;
        int minLength = Integer.MAX_VALUE;
        for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
            sum += arr[windowEnd];
            while (sum >= s){
                minLength = Math.min(minLength , windowEnd - windowStart + 1);
                sum -= arr[windowStart];
                windowStart++;
            }

        }
        return minLength;
    }
}
