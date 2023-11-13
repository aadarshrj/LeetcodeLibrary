public class Print20 {
    public static void main(String[] args) {
        print20(1);
    }
    private static void print20(int n){
        if(n == 20){
            System.out.print("20");
            return;
        }else {
            System.out.print(n+" ");
            n++;
            print20(n);
        }
    }
}
