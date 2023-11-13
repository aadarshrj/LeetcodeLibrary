import java.util.Arrays;
import java.util.HashMap;

public class ContiguousSub {
    public static void main(String[] args) {
       int arr[] = {23,2,4,6,7};
       int k = 6;
        System.out.println(isConti(arr , k));
    }
    public static boolean isConti(int[] array , int k){
        HashMap<Integer , Integer> map = new HashMap<>();
        map.put(0 , -1);
    boolean val=    Arrays.stream(array).allMatch(i -> {
            int remainder = i % k;
            boolean flag = false;
            if(!map.containsKey(remainder)){
                map.put(remainder , i);
            }else{
                flag = true;
                return true;
            }
        return flag;
       });
        return val;
    }
}
