package SlidingWindow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StringAnagram {
    public static void main(String[] args) {
        String s = "ppqp";
        String pattern = "pq";
        System.out.println(returnAnagramList(s,pattern).toString());
    }
    public static List<Integer> returnAnagramList(String s , String p){
        List<Integer> result = new ArrayList<>();
        Map<Character , Integer> map = new HashMap<>();
        int windowStart = 0;
        int matched = 0;
        for (int i = 0; i < p.length(); i++) {
            map.put(p.charAt(i) , map.getOrDefault(p.charAt(i),0)+1);
        }
        for (int windowEnd = 0; windowEnd < s.length(); windowEnd++) {
            char rightChar = s.charAt(windowEnd);

            if (map.containsKey(rightChar)){
                map.put(rightChar,map.get(rightChar) - 1);
                if(map.get(rightChar) == 0){
                    matched++;
                }
            }
            if(matched == map.size()){
                result.add(windowStart);
            }
            if (windowEnd >= p.length() - 1){
                char leftChar = s.charAt(windowStart);
                windowStart++;
                if(map.containsKey(leftChar)){
                    if(map.get(leftChar) == 0){
                        matched--;
                    }
                    map.put(leftChar,map.get(leftChar)+1);
                }
            }
        }
        return result;
    }
}
