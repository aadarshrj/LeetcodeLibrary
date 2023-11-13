package Recursion;

public class PrintNum {
    public static void main(String[] args) {
        PrintNum obj = new PrintNum();
        obj.recursivePrint(5 , 2);

    }
    private boolean recursivePrint(int n , int i){
            if(n < 2){
                return false;
            }
            if(i == 1){
                return true;
            }
            else if(n % i == 0){
                return false;
            }
            else {
                recursivePrint(n , i - 1);
            }
            return false;
    }
}
