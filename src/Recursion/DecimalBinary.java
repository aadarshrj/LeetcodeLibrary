package Recursion;

public class DecimalBinary {
    public static void main(String[] args) {
        System.out.println(new DecimalBinary().decimalBinary(4));
    }
    public int decimalBinary(int n){
       if(n == 0){
           return 0;
       }
       return (n % 2 + 10*decimalBinary(n / 2));
    }
}
