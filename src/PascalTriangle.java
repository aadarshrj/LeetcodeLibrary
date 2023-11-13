import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    //Here We will draw pascals triangle
    public static void main(String[] args) {
        draw(9);
    }
    public static void draw(int numRows){
        List<List<Integer>> triangle = new ArrayList<>();
        List<Integer> firstrow = new ArrayList<>();
        firstrow.add(1);
        triangle.add(firstrow);

        for (int i = 1; i < numRows; i++) {
            List<Integer> prevrow = triangle.get(i - 1);
            List<Integer> currentrow = new ArrayList<>();

            currentrow.add(1);

            for (int j = 1 ; j < i ; j++){
                currentrow.add(prevrow.get(j - 1) + prevrow.get(j));
            }
            currentrow.add(1);
            triangle.add(currentrow);
        }
       for(List<Integer> list:triangle){
           for (int i = 0; i < (triangle.size() - list.size()); i++) {
               System.out.print(" ");
           }
           for (int i = 0; i <  list.size(); i++) {
               System.out.print(list.get(i)+" ");
           }
           System.out.println();
       }
    }
}
