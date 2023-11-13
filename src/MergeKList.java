import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

public class MergeKList {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        LinkedList[] ll = new LinkedList[10];
        for (int i = 0; i < 9; i++) {
            System.out.println("Enter spaced values :");
            int[] arr = Arrays.stream(br.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            ll[i] = new LinkedList<>(Arrays.asList(arr));
        }
        System.out.println(Arrays.toString(ll));
        PriorityQueue<LinkedList> pq = new PriorityQueue<>();

    }
}
