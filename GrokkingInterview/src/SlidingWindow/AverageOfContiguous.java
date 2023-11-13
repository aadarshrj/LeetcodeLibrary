package SlidingWindow;

import java.util.ArrayList;
import java.util.List;

public class AverageOfContiguous {
    //Iteration
    public static List<Double> average(int[] arr , int k){
        List<Double> res = new ArrayList<>();

        //Looping till the boxes only.
        for (int i = 0; i <= arr.length - k ; i++) {
            double sum = 0;
            for (int j = i; j < i+k; j++) {
                sum += arr[j];
            }
            double avg = sum/(double) k;
            res.add(avg);
        }
        return res;
    }
    //Sliding Window
    public static List<Double> average2(int[] arr,int k){
        int windowStart = 0;
        List<Double> res = new ArrayList<>();
        double sum = 0;
        for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
            sum += arr[windowEnd];
            if (windowEnd >= k - 1){
                double avg = sum/(double)k;
                res.add(avg);
                sum -= arr[windowStart];
                windowStart++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 6, -1, 4, 1, 8, 2};
        int k=5;
        System.out.println("By iteration method "+average(arr,5).toString());
        System.out.println("By SlidingWindow method "+average2(arr,5).toString());
    }
}
