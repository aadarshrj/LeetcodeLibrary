import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class TestingTutorial {
    public static void main(String[] args) {
        Map<String , String> map = new HashMap<>(){{
            put("A","23");
            put("B","24");
            put("C","25");
        }};

        Map<String , String> deepCopy = map.entrySet()
                                        .stream()
                                        .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
        for (String key : deepCopy.keySet()){
            System.out.printf("\nKey is %s and value is %s",key,deepCopy.get(key));
        }
    }
}
