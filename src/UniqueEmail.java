import java.util.HashSet;
import java.util.Set;

public class UniqueEmail {
    public static int uniqueEmail(String[] emails){
        Set<String> set = new HashSet<>();

        for (int i = 0; i < emails.length ; i++) {
            String part[] = emails[i].split("@");
            String localname = part[0];
            localname = localname.replace(".","");
            String localNames[] = localname.split("\\+");
            set.add(localNames[0]+"@"+part[1]);
        }
        return set.size();
    }

    public static void main(String[] args) {
       String email[] = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
        System.out.println(uniqueEmail(email));
    }
}
