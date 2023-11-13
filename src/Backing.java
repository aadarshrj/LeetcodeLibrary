import java.util.ArrayList;
import java.util.List;

public class Backing {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 6, -1, 4, 1, 8, 2};
        int K = 5;
        List<Integer> res = new ArrayList<>();
        int sum = 0;
        int start = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if(i >= K - 1){
                res.add(sum/K);
                sum -= arr[start];
                start++;
            }
        }
        System.out.println(res.toString());
    }
}
