package Maps;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class UnsortedMap<K,V> extends AbstractMap<K,V>{
    private List<MapEntry<K,V>> list = new ArrayList<>();

    public UnsortedMap(){}
    @Override
    public int size() {
        return list.size();
    }
    private int findIndex(K key){
        return IntStream.range(0 , list.size()).filter(i -> list.get(i).getKey().equals(key))
                .findFirst()
                .orElse(-1);
    }
   public V get(K key){
        int index = findIndex(key);
        return index==-1? null : list.get(index).getValue();
   }
    public V put(K key,V value){
        int index = findIndex(key);
        if(index == -1){
            list.add(new MapEntry<K,V>(key,value));
            return null;
        }else{

           return list.get(index).setValue(value);
        }
    }
    public V remove(K key){
        int index = findIndex(key);
        if (index == -1)return null;
        V ans = list.get(index).getValue();
        if(index != size() - 1){
            list.set(index , list.get(size() - 1));
            list.remove(size() - 1);
        }
        return ans;
    }
}
