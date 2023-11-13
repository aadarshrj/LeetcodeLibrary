package AlgoExpert;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MonotonicArray {
    public static void main(String[] args) {
        System.out.println("Enter the Input array");
        while (true) {
            try {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                int array[] = Arrays.stream(br.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
                System.out.println("Enter word");
                String word = br.readLine();
                if(isMonotonic(array)){
                    System.out.println("monotonic");
                }
                if(word.equals("Stop"));
                {
                    System.out.println("End of the execution.");
                    break;
                }

            } catch (Exception e) {
                System.out.println("Exception caught is buffered reader");
                break;
            }

        }
    }
    public static boolean isMonotonic(int[] array){
        int direction = array[1] - array[0];

        for (int i = 2; i < array.length ; i++) {
            if (direction == 0){
                direction = array[i] - array[i - 1];
                continue;
            }

            if(isBreaking(direction ,array[i],array[i-1])){
                return false;
            }

        }
        return true;
    }
    public static boolean isBreaking(int direction , int curr,int prev){
        int diff = curr - prev;
        if (direction > 0){
            return diff < 0;
        }
        return diff > 0;
        /*
        * Another way to do this--
        *   boolean nonDec = true;
        *   boolean nonInc = true;
        *
        *   for(int i = 0 ; i< array.length ;i++){
        *   if(arr[i] < arr[i - 1]){
        *       nonDec = false;
        *   }
        *   if(arr[i] > arr[i - 1]){
        *       nonInc = false;
        *      }
        *   return nonInc || nonDec 
        * }
        *
        * */
    }
}