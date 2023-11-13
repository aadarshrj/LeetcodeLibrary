package Recursion;
//Merge characters on the basis of their ASCII value.
public class AlternateCharacter {
    public static void main(String[] args) {
        String s1 = "ace";
        String s2 = "bdf";
        System.out.println(getAlternate(s1,s2));
    }
    private static String getAlternate(String s1 , String s2){
        if (s1 == null || s1.equals("")){
            return s2 == null ? s1 : s2;
        }else if(s2 == null || s2.equals("")){
            return s1;
        }else if(s2.charAt(0) > s1.charAt(0)){
            return s1.charAt(0) + getAlternate(s1.substring(1 , s1.length()), s2);
        }else {
            return s2.charAt(0) + getAlternate(s1 , s2.substring(1 , s2.length()));
        }

    }
}
