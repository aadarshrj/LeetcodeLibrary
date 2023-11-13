package AlgoPatterns.slidingWindow;

import java.util.HashMap;
import java.util.Map;

public class SubstringKDistinctCharacter {
    public static int getLength(String s, int k) {
        int windowStart = 0;
        int length = Integer.MIN_VALUE;

        Map<Character , Integer> freq = new HashMap<>();

        for (int windowEnd = 0; windowEnd < s.length(); windowEnd++) {
               char c = s.charAt(windowEnd);
               freq.put(c , freq.getOrDefault(c , 0)+1);

               while (freq.size() > k){
                   char cremove = s.charAt(windowStart);
                   freq.put(cremove , freq.get(cremove) - 1);
                   if (freq.get(cremove) == 0){
                       freq.remove(cremove);
                   }
                windowStart++;
               }
            length = Math.max(length , windowEnd - windowStart + 1);
        }
        return 0;
    }
}
