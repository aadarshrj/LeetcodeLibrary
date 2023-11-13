package SlidingWindow;

import java.util.Arrays;
import java.util.Iterator;

public class TripletSmallerSum {
    public static void main(String[] args) {
        int arr[] = {-1, 0, 2, 3};
        int target = 3;


    }
    public static int smallerTriplet(int[] arr , int target){
        int sum = Integer.MAX_VALUE;
        int count = 0;
        for (int i = 0; i < arr.length - 2; i++) {
            if(i > 0 && arr[i] == arr[i - 1]){
                continue;
            }
            int left = i+1;
            int right = arr.length;
            while(left < right){
                int currsum = arr[left] + arr[right] + arr[i];
                if(currsum < target){
                    count += right - left; /*to add those triplets in the arraylist what we
                    we have to do is for(ini i = right ; i > left;i--){
                    add arr[i],arr[left],arr[right]}*/
                    left++;
                }else {
                    right--;
                }
            }
        }
        return count;
    }
}
