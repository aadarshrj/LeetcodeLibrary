import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Testing {
    public static void main(String[] args) {
        String s = "2";
        System.out.println(s.charAt(0) - '0');
            int i = 3;
        for (;i < 4; i++) {
            System.out.println("Printing from i" + i);
        }
        System.out.printf("Printing from the outer loop %d",i);
    }
}