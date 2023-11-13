package Recursion;

public class FirstOccurence {
    public static void main(String[] args) {
        int[] arr = {2,3,4,3,5,6};
        System.out.println(getIndex(arr,0,3));
    }
    public static int getIndex(int[] array , int index , int ele){
        if(index >= array.length){
            return -1;
        }else if(array[index] == ele){
            return index;
        }
        return getIndex(array , index + 1 , ele);
    }
}
