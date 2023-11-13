import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
        //int matrix[][] = {{1,2,3},{4,5,6},{7,8,9}};
        spiralTraverse();
    }
    public static void spiralTraverse(){
        int topfence = 0;                                   /*
                                                           [[1,2,3],
                                                            [4,5,6],
                                                            [7,8,9]]
                                                           [1,2,3,6,9,8,7,4,5]
                                                           */
        int bottomfence = 3 - 1;
        int left = 0;
        int right = 3 - 1;
        int[][] matrix = new int[3][3];
        int num = 1;
        while (topfence <= bottomfence && left <= right){
            for (int col = left ; col <= right ; col++){
                matrix[topfence][col] = num;
                num++;
            }
            topfence++;
            for (int row = topfence ; row<= bottomfence ; row++){
                matrix[row][right] = num;
                num++;
            }
            right--;
            if(topfence<= bottomfence){
                for (int col = right; col >= left ; col--) {
                   matrix[bottomfence][col] = num;
                   num++;
                }
            }
            bottomfence--;
            if (left<= right){
                for (int row = bottomfence; row>= topfence ; row--){
                    matrix[row][left] = num;
                    num++;
                }
            }
            left++;
        }
        for (int i = 0; i <matrix.length ; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }
}
