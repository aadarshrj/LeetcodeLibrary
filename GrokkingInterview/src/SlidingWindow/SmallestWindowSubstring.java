package SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class SmallestWindowSubstring {
    public static void main(String[] args) {
        String s = "aabdec";
        String pattern = "abc";
        System.out.println(s.substring(0,4));
    }
    public static void smallWindow(String s , String p){
        Map<Character , Integer> map = new HashMap<>();
        int matched = 0;
        int Wsize = Integer.MAX_VALUE;
        for (int i = 0; i < p.length(); i++) {
            map.put(p.charAt(i) , map.getOrDefault(p.charAt(i),0)+1);
        }
        for (int windowEnd = 0; windowEnd < s.length(); windowEnd++) {
            char rightChar = s.charAt(windowEnd);
            if(map.containsKey(rightChar) && map.get(rightChar) != 0){
                map.put(rightChar , map.get(rightChar) - 1);
                if(map.get(rightChar) >= 0){
                    matched++;
                }
            }
            while (matched == p.length()){

            }
        }
    }
}
