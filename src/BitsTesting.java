import java.util.Arrays;
import java.util.PriorityQueue;

public class BitsTesting {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int rows = arr.length;
        PriorityQueue<Integer> min_heap = new PriorityQueue<>();


        int column = arr[0].length;
        int start = 0;
        int end = rows*column - 1;
        for (int i = start; i <= end ; i++) {
            int ele = arr[i/column][i % column];
            System.out.print(ele);
        }

    }
}
