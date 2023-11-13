import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumDifference {
    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>();

        int arr[] = {4, 2, 1, 3};
        Arrays.sort(arr);
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length - 1 ; i++) {
            int diff = arr[i + 1] - arr[i];
            if(diff < smallest){
                smallest = diff;
                list.clear();
                list.add(Arrays.asList(arr[i + 1],arr[i]));
            } else if(diff == smallest){
                list.add(Arrays.asList(arr[i + 1],arr[i]));
            }
        }
        for (int i = 0; i < list.size() ; i++) {
            System.out.println(list.toString());
        }
    }
}