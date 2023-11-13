import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreater {
    public static void main(String[] args) {
       int nums[] = {9, 6, 10, 9, 5};
        Stack<Integer> stack = new Stack<>();
        HashMap<Integer,Integer> map = new HashMap<>();

        Arrays.stream(nums).forEach(x -> stack.push(x));

        for (int i = 0; i < nums.length ; i++) {
            while (stack.peek() > nums[i]){
                stack.pop();
            }
        }

    }
}
