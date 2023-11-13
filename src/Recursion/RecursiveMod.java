package Recursion;

public class RecursiveMod {
    public static void main(String[] args) {

    }
    private int recursiveMod(int divisor , int dividend){
        if(divisor == 0){
            return -1;
        }
        if(dividend < divisor){
            return dividend;
        }else{
            return recursiveMod(divisor , dividend - divisor);
        }
    }
}
