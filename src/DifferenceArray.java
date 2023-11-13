import java.util.*;

public class DifferenceArray {
    public static void main(String[] args) {
        int arr[] = {2,1,3,1,2,3,3};
        Map<Integer , List<Integer>>  map= new HashMap<>();
        for (int i = 0; i < arr.length ; i++) {
            if (map.containsKey(arr[i])){
                List<Integer> list = new ArrayList<>();
                list.addAll(map.get(arr[i]));
                list.add(i);
                map.put(arr[i] , list);
            }else {
                List<Integer> lst = new ArrayList<>();
                lst.add(i);
                map.put(arr[i] , lst);
            }
        }
        for (int key : map.keySet()){
            System.out.println("The key is "+key +"\nIndices are "+map.get(key).toString());
        }
    }
}
