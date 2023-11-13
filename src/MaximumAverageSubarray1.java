public class MaximumAverageSubarray1 {
    public static void main(String[] args) {
        int[] array = {1,12,-5,-6,50,3};
        int k = 4;

        System.out.println(maxavg(array , k));
    }
    public static double maxavg(int[] arr , int k){
        int maxavg = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length ; i++) {
            int currsum = 0;
            for (int j = 0 ; j< k ;j++){
                if( i + (k - 1) <= arr.length - 1){
                    currsum += arr[i + j];
                }else {
                    i = arr.length;
                    j = k;
                }
            }
            maxavg = Math.max(maxavg,currsum);
        }
        return  (double)maxavg/4;
    }
}
