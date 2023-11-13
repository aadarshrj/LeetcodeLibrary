import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets {
    public static void main(String[] args) {
        int[] num = {1,3,3};
        /* i = 0  sI = 0 eI = 0  list [] [1]
        * for i = 1 ----  si = 0 ei = 1 list [] [1] [3] [1 3]
        * for i = 2 ------ st = 2 ei = 3 list [] [1] [3] [1 3] [3 3] [1 3 3]
        * */

        int startIndex = 0;
        int endIndex = 0;
        List<List<Integer>> list = new ArrayList<>();
        list.add(new ArrayList<>());
        List<Integer> ls = new ArrayList<>();
        String s = String.valueOf(num);
        System.out.println(s);
        for (int i = 0; i < num.length ; i++) {
            startIndex = 0;

            if(i > 0 && num[i] == num[i - 1]){
                startIndex = endIndex+1;
            }
            endIndex = list.size() - 1;
            System.out.printf(" In the %d run, the value of startIndex is %d and endIndex is %d", i, startIndex, endIndex);
            for (int j = startIndex; j <= endIndex; j++) {
                List<Integer> res = new ArrayList<>(list.get(j));
                res.add(num[i]);
                list.add(res);
            }
        }
    }
}
