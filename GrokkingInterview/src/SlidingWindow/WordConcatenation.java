package SlidingWindow;

import java.util.Arrays;

public class WordConcatenation {
    public static void main(String[] args) {
        String s = "catfoxcat";
        String[] words = {"cat", "fox"};
        String sd = Arrays.stream(words).toString();
        System.out.println(sd);
    }
}
