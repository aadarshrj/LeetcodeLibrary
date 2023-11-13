package Recursion;

public class Palindrome {
    public static void main(String[] args) {

    }
        private static boolean isPalindrome(String s){
                if(s.length() == 0){
                    return false;
                }else if(s.length() == 1){
                    return true;
                } else if (s.charAt(0) == s.charAt(s.length() - 1)) {
                    return isPalindrome(s.substring(1,s.length() -1));
                }
            return false;
    }
}
