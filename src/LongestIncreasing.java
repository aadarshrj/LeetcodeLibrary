public class LongestIncreasing {
    //Here we have to check  contiguos increasing array

    public static void main(String[] args) {
        int arr[] = {1,3,5,4,7};

        int current = 0;
        int max = 0;

        for (int i = 0; i < arr.length ; i++) {
            if(i == 0){
                current = 1;
            }else if(arr[i] > arr[i - 1]){
                current++;
            }else{

                max = Math.max(current , max);
                current = 1;
            }
        }
        max =Math.max(current,max);
        System.out.println(max);
    }
}
