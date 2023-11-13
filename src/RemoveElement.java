import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        int arr[] = {2,3,3,2};
        int val = 3;
        String s = "dfads";

        int elements = 0;
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i] == val){
                elements++;
            }else if(elements > 0){
                int t = arr[i];
                arr[i] = val;
                System.out.println("Position :"+ (i - elements));
                arr[i - elements] = t;
            }
        }
        System.out.println(arr.length - elements);
        System.out.println(Arrays.toString(arr));
    }
}
