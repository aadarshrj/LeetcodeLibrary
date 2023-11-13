public class SquareNumber {
    private static int square(int n){
        if(n == 0){
            return 0;
        }else {
            return square(n - 1) + (2 * n) - 1;
        }
    }

    public static void main(String[] args) {
        System.out.println(Math.log(4));
    }
}
