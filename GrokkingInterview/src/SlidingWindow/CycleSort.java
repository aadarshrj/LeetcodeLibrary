package SlidingWindow;

import java.util.Arrays;

public class CycleSort {
    public static void main(String[] args) {
        int[] arr = {2,5,1,4};
        cycleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void cycleSort(int[] arr){
        int i = 0 ;

        while (i < arr.length){

            int j = arr[i] - 1;
            //arr[i] = 3
            //arr[j] = 6
            //swap happened arr[i] = 6 and arr[j] will have 3.
            if(arr[i] < arr.length &&  arr[j] != arr[i]){
               int temp = arr[i];
               arr[i] = arr[j];
               arr[j] = temp;
            }else{
                i++;
            }
        }
        System.out.println();
    }
}
