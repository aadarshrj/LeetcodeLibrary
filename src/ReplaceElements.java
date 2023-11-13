import java.util.Arrays;
import java.util.List;

public class ReplaceElements {
    public static void main(String[] args) {
        int[] arr = {17,18,5,4,6,1};
            int rightMax = -1;

        for (int i = arr.length - 1; i >= 0 ; i--) {
            int newMax = Math.max(rightMax,arr[i]);
            System.out.println("New Max:"+newMax);
            arr[i] = rightMax;
            System.out.println("Value added: "+rightMax);
            rightMax = newMax;
            System.out.println("Now rightMax = newMax"+rightMax);
        }
        System.out.println(Arrays.toString(arr));
    }
}
