package AlgoPatterns.slidingWindow;

import java.util.ArrayList;
import java.util.List;

public class AverageContiguous {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,23};
        System.out.println(new AverageContiguous().averages(arr,2).toString());
    }
    private List<Integer> averages(int[] arr , int k){
        int sum = 0;
        int windowStart = 0;
        List<Integer> res = new ArrayList<>();
        for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
            sum += arr[windowEnd];
            if(windowEnd >= k - 1){
                int avg = sum / k;
                res.add(avg);
                sum -= arr[windowStart];
                windowStart++;
            }
        }
        return res;
    }
}
