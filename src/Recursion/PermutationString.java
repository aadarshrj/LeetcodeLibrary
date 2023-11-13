package Recursion;

public class PermutationString {
    public static void main(String[] args) {
       String s = "abc";
        getPermutation(s.toCharArray() , s.length());
    }
    private static void getPermutation(char[] s , int length){
        if(length == 1){
            System.out.println(s);
            return;
        }else{
            for (int i = 0; i < length; i++) {
                swap(s , i , length - 1);
                getPermutation(s , length - 1);
                swap(s , i , length - 1);
            }
        }
    }
    private static void swap(char[] array, int i, int j){
        char c ;
        c = array[i];
        array[i] = array[j];
        array[j] = c;
    }
}
