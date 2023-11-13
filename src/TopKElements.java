import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TopKElements {
    public static void main(String[] args) {
       int num[] = {1,2,4};
       int ans = 0;
       List<Integer> list = Arrays.asList(2,3,4,5);
    int[] arr = list.stream().mapToInt(i -> i).toArray();
        System.out.println(Arrays.toString(arr));
    }
}
