import java.util.Arrays;

public class SortingAlgorithm {
    public static void main(String[] args) {
        int[] arr = {10,2,5,3,6,0,8,1};
        SortingAlgorithm so = new SortingAlgorithm();
        so.mergeSort(arr , 0 , arr.length - 1);
        System.out.println(Arrays.toString(arr));

    }

    //Merge Sort
    public void mergeSort(int[] nums, int left, int right) {
        //Base Case for our recursion if one element or no element
        if (right - left + 1 <= 1) {
            return;
        }
        //Mid element we will take
        int mid = left + (right - left) / 2;
        //We will call the recursion here
        mergeSort(nums, left, mid);
        mergeSort(nums, mid + 1, right);
        merge(nums, left, mid, right);
    }

    public void merge(int[] nums, int left, int mid, int right) {
        int left_pointer = left;
        int right_pointer = mid + 1;
        int[] buffer = new int[right - left + 1];
        int t = 0;
        while (left_pointer <= mid && right_pointer <= right) {
            if (nums[left_pointer] < nums[right_pointer]) {
                buffer[t++] = nums[left_pointer++];
            } else {
                buffer[t++] = nums[right_pointer++];
            }
        }
        while (left_pointer <= mid) {
            buffer[t++] = nums[left_pointer++];
        }
        while (right_pointer <= right) {
            buffer[t++] = nums[right_pointer++];
        }
        for (int i = left; i <= right; i++) {
            nums[i] = buffer[i - left];
        }
    }
}