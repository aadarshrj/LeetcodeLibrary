package AlgoExpert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//First Using brute force technique O(n^3) time
public class ThreeSum {
    public static void main(String[] args) {
        int array[] = {12,3,1,2,-6,5,-8,6};
        int k = 0;
        Arrays.sort(array);
        List<Integer> lst = new ArrayList<>();

        System.out.println(Arrays.toString(threeSum(array,k)));
    }

    public static int[] threeSum(int[] array ,int k) {

        List<Integer> ls = new ArrayList<>();
        for (int i = 0; i < array.length - 2; i++) {

            int left = i + 1 ;
            int right = array.length - 1;
                    while (left < right){
                       int sum = array[i] + array[left] + array[right];
                        if(sum == k){
                            ls.addAll(Arrays.asList(array[i],array[left],array[right]));
                            System.out.println(ls.toString());
                            return new int[]{array[i],array[left],array[right]};
                        }else if(sum < k){
                            sum -= array[left];
                            left++;
                        }else{
                            sum -= array[right];
                            right--;
                        }
                    }
        }
        return null;
    }
}
