import java.util.HashMap;

public class Anagram {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "gramana";

        HashMap<Character,Integer> smap = new HashMap<>();
        HashMap<Character,Integer> tmap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (smap.containsKey(s.charAt(i))){
                Integer c = smap.get(s.charAt(i));
                smap.put(s.charAt(i) ,c++);
            }else{
                smap.put(s.charAt(i) , 1);
            }
            if (tmap.containsKey(t.charAt(i))){
                Integer c = tmap.get(t.charAt(i));
                tmap.put(t.charAt(i) ,c++);
            }else{
                tmap.put(t.charAt(i) , 1);
            }
        }
        if(smap.equals(tmap)){
            System.out.println("String is anagram");
        }else{
            System.out.println("Not an anagram");
        }
    }
}
