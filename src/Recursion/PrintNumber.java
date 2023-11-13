package Recursion;

public class PrintNumber {
    public static void main(String[] args) {
        print(10,0);
    }
    public static void print(int num ,int n)
    {
        if (n == num){
            System.out.println(n);
            return;
        }

        System.out.println(n);
        print(num, n+1);
    }
}
