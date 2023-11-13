package Recursion;

public class PalindromeArray {
    public static void main(String[] args) {
        int[] arr1 = {1,2,2,1};
        int[] arr2 = {1,2,3,4};
        StringBuilder s = new StringBuilder("Asda");
        s.append('w');
        System.out.println("Now the S is ::"+ s);
        System.out.println("Is palindrome arr1::"+isPalindrome(arr1,0,arr1.length - 1));
        System.out.println("Is palindrome arr2::"+isPalindrome(arr2,0,arr2.length - 1));
    }
    public static boolean isPalindrome(int[] arr ,int i,int j){
        if(arr.length == 1){
            return true;
        }else if(i == j || i > j){
            return true;
        }else if(arr[i] == arr[j]){
            return isPalindrome(arr, i + 1 , j - 1);
        }
        return false;
    }

    public static boolean palindromeTwo(int[] arr , int index){
        if(index == arr.length/2){
            return true;
        }else if(arr[index] != arr[arr.length - 1 - index]){
            return false;
        }else{
            return palindromeTwo(arr , index + 1);
        }
    }
}
