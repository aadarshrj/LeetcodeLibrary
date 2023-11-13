import java.util.Arrays;

public class ProductExcept {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        int res[] = new int[arr.length];
        Arrays.stream(arr).forEach(i -> {
            int product = 1;
            for (int j = 0; j < arr.length; j++) {
                if(i == j){
                    continue;
                }
                product *= arr[j];
            }
            res[i] = product;
        });
        System.out.println(Arrays.toString(res));
    }
}
