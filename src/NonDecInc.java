public class NonDecInc {
    public static void main(String[] args) {
        double abg = Double.NEGATIVE_INFINITY;
    }
    public static String incordec(int[] arr) {
        int direction = arr[1] - arr[0];
        for (int i = 2; i < arr.length; i++) {
            if (direction == 0) {
                direction = arr[i] = arr[i - 1];
                continue;
            }
            if (isBreaking(direction, arr[i], arr[i - 1])) {
                System.out.println("not monotonic array");
            }
        }
        System.out.println("Monotonic array");
        return "s";
    }

    private static boolean isBreaking(int direction, int curr, int prev) {
        int diff = curr - prev;
        if(direction > 0){
            return diff < 0;
        }
        return diff > 0;
    }
}
