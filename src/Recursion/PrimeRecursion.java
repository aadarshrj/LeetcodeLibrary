package Recursion;

public class PrimeRecursion {
    public static void main(String[] args) {

    }
    private boolean isPrime(int num , int i){
        if(num < 2){
            return false;
        }
       else if (i == 1){
            return true;
        }
        else if(num % i == 0){
            return false;
        }
        return isPrime(num , i - 1);
    }
}
