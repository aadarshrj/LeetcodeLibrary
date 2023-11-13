package SlidingWindow;

import java.util.ArrayList;
import java.util.List;

public class CorruptPair {
    public static void main(String[] args) {
        int[] arr = {3,1,2,5,2};
        List<Integer> list = new ArrayList<>();
        int i = 0;
        while(i < arr.length){
            if(arr[i] != arr[arr[i] - 1]){
               swap(arr,i , arr[i]-1);
            }else{
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j+1){
                list.add(j+1);
            }
        }
        System.out.println(list.toString());
    }
    public static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
