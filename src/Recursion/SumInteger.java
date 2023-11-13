package Recursion;

public class SumInteger {
    public static void main(String[] args) {
        System.out.println(new SumInteger().sum(99));
    }
    private int sum(int n){
        if(n == 0){
            return 0;
        }else{
            return n + sum(n - 1);
        }
    }
}
