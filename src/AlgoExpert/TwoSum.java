package AlgoExpert;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int array[] = {-4,-1,1,3,5,6,8,11};
        int k = 13;
        System.out.println("Two sum1: "+Arrays.toString(twosum1(array,k)));
        System.out.println("Two sum2: "+Arrays.toString(twosum2(array,k)));
        System.out.println("Two sum3: "+Arrays.toString(twosum3(array,k)));
    }
    //Using loop
    public static int[] twosum1(int[] arr,int k){
        int[] result = new int[2];
        int cur = 0;
        for (int i = 0; i < arr.length; i++) {
            cur = arr[i];
            result[0] = cur;
            for (int j = i + 1 ; j < arr.length ; j++){
                cur += arr[j];
                if(cur == k){
                    result[1] = arr[j];
                    return result;
                }else{
                    cur -= arr[j];
                }
            }
        }
        return null;
    }
    //Using Hasmap
    public static int[] twosum2(int[] arr , int k){
        Map<Integer,Boolean> map = new HashMap<>();

        for (int i = 0; i < arr.length ; i++) {
            if (map.containsKey(k - arr[i])){
                return new int[]{k - arr[i],arr[i]};
            }else{
                map.put(arr[i],true);
            }
        }
        return null;
    }
    //Using Sorting
    public static int[] twosum3(int[] arr,int k){
        int array[] = arr;
        Arrays.sort(array);
        int i = 0;
        int j = array.length - 1;
        while (i < j){
            int sum = i+j;
            if(sum == k){
                return new int[]{i,j};
            }else if(sum < k){
                i++;
            }else{
                j--;
            }
        }
        return null;
    }
}
