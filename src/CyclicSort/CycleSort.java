package CyclicSort;

import java.util.Arrays;

public class CycleSort {
    public static void sort(int[] nums){
        int i = 0; //Starting index of the number

        while (i < nums.length){
            int j = nums[i] - 1; // Correct index of the nums[i];
            if(nums[i] != nums[j]){
                swap(nums , i , j);
            }else {
                i++;
            }
        }
    }
    public static void swap(int[] nums, int i , int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {3,1,5,4,2};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
