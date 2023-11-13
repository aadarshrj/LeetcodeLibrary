import java.util.Arrays;

public class MaxSubarray {

    public static void main(String[] args) {
        int arr[] = {-2,1,-3,4,-1,2,1,-5,4};

        int currentMax =arr[0];
        int max = arr[0];

        for (int i = 0; i < arr.length ; i++) {
            //It will check if the next number is greater than the sum of previous number
            // plus next number and update the current max accordingly
            currentMax = Math.max(arr[i],currentMax+arr[i]);
            max = Math.max(max,currentMax);

        }
        System.out.println(max );
    }
}
