package Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int array[] = {23,4,1,78,9,-2,0,234,7};
        sort(array);
        System.out.println(Arrays.toString(array));
    }
    public static void sort(int[] array){
        for (int i = 1; i < array.length ; i++) {
            int j = i;

            while(j > 0 && array[j] < array[j - 1]){
                int temp = array[j - 1];
                array[j - 1] = array[j];
                array[j] = temp;
                j--;
            }
        }
    }
}
