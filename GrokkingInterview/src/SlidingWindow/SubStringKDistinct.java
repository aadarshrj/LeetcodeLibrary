package SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class SubStringKDistinct {
    public static void main(String[] args) {
       String str =  "araaci" ; int K=2;
       int windowStart = 0;
       int maxSize = 0;
        Map<Character,Integer> frequency = new HashMap<>();

        for (int windowEnd = 0; windowEnd < str.length() ; windowEnd++) {
            char rightChar = str.charAt(windowEnd);
            frequency.put(rightChar, frequency.getOrDefault(rightChar,0)+1);
            while (frequency.size() > K){
                char leftChar = str.charAt(windowStart);
                frequency.put(leftChar , frequency.get(leftChar) - 1);
                if(frequency.get(leftChar) == 0){
                    frequency.remove(leftChar);
                }
                windowStart++;
            }
            maxSize = Math.max(maxSize , windowEnd - windowStart + 1);
        }
        System.out.println(maxSize);
    }
}
