package AlgoExpert;

import java.util.Arrays;
import java.util.List;

//Here We check the difference between two elements of two array
public class SmallestDifference {
    public static void main(String[] args) {
        int arr1[] = {-1,5,10,20,28,3};
        int arr2[] = {26,134,135,15,17};
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(smallDiff(arr1,arr2)));


    }
    public static int[] smallDiff(int[] arr1 , int[] arr2){
        int firstInd = 0;
        int secInd = 0;
        int[] smallpair = new int[2];
        int current = Integer.MAX_VALUE;
        int smallest = Integer.MAX_VALUE;
        while(firstInd < arr1.length && secInd < arr2.length){
            int eleArr1 = arr1[firstInd];
            int eleArr2 = arr2[secInd];
            current = Math.abs(eleArr1 - eleArr2);

                if(eleArr1 < eleArr2){
                    firstInd++;
                }else if(eleArr2 < eleArr1){
                    secInd++;
                } else {
                    return new int[]{arr1[firstInd] , arr2[secInd]};
                }
            if(smallest > current){
                smallest = current;
                smallpair[0] = eleArr1;
                smallpair[1] = eleArr2;
            }
        }
        return smallpair;
    }
}
