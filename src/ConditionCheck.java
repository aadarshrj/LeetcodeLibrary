public class ConditionCheck {
    public static void main(String[] args) {
        int p = 2;
        for (int i = 0; i < p - 1; i++) {
            System.out.println("Inside loop "+p);
            p--;
        }
        System.out.println("Outside the loop "+p);
    }
}
