import java.util.ArrayList;
import java.util.List;

public class TestClass {
    public static void main(String[] args) {
        String test = "a";
        StringBuilder sb = new StringBuilder();
        int start = 0;
        List<String> list = new ArrayList<>();
        for (int i = 0; i < test.length() ; i++) {
                sb.append(test.charAt(i));
                if(i - start + 1 == 2){
                    list.add(sb.toString());
                    sb.deleteCharAt(start);
                    
                    start++;
                }
            }
        System.out.println(list.toString());
        }
    }

