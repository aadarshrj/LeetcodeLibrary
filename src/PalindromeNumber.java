import java.util.Arrays;

//We have to check a number is palindrome
public class PalindromeNumber {
    public static void main(String[] args) {
        int arr[] ={2,4,51,2,5,7,8,9,2,2,34};
        int begin = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 2){
                arr[begin] = arr[i];
                begin++;
            }
        }
        for (int i = begin; i < arr.length ; i++) {
            arr[i] = 0;
        }
        System.out.println(Arrays.toString(arr));
    }
}
