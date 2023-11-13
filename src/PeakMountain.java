public class PeakMountain {
    //This type of array is called bitonic array and it has one peak
    public static void main(String[] args) {
        int arr[] = {0,10,5,2};

        int i = 0;
        while (arr[i] < arr[i+1]){
            i++;
        }
        System.out.println(i);
    }
}
