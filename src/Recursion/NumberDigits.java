package Recursion;

public class NumberDigits {
    public static void main(String[] args) {
        System.out.println(digitsNum(1234123120));
    }
    public static int digitsNum(int num){
        if(num == 0){
            return 0;
        }
        return 1 + digitsNum(num / 10);
    }
}
