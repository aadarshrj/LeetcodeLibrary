package Recursion;

import java.util.PriorityQueue;

public class ReverseString {
    public static void main(String[] args) {
        String s = "Hello World";
        System.out.println(new ReverseString().reverse(s , s.length() - 1));

    }
    private String reverse(String s, int index){
        if(index < 0){
            return "";
        }
        return s.charAt(index)+reverse(s , index - 1);
    }
}
