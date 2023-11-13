import java.util.HashMap;

public class Isomorphic {
    public static void main(String[] args) {
        String s = "foo";
        String t = "bar";

        HashMap<Character,Character> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
                if(map.containsKey(s.charAt(i))){
                    if(map.get(s.charAt(i)) == t.charAt(i)){
                        continue;
                    }else{
                        System.out.println("false");
                        break;
                    }
                }else{
                    map.put(s.charAt(i),t.charAt(i));
                }

        }
        System.out.println("true");
    }
}
