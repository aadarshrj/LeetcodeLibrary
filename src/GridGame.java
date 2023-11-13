import java.util.Arrays;

public class GridGame {
    public static void main(String[] args) {
        int grid[][] = {{2,5,4},{1,5,1}};
        int topsum = Arrays.stream(grid[0]).sum();
        int bottomsum = 0;
        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < grid[0].length ; i++) {
            topsum -= grid[0][i];
            ans = Math.min(ans,Math.max(topsum,bottomsum));
            bottomsum = grid[1][i];
        }
        System.out.println(ans);
    }
}
