package Maps;
import java.util.Iterator;
import java.util.Map.Entry;

public class AbstractMap<K , V> implements Map<K , V> {

    protected class MapEntry<K , V> implements Entry<K , V>{
        private K k;
        private V v;

        public MapEntry(K key, V value) {
            this.k = key;
            this.v = value;
        }

        @Override
        public K getKey() {
            return this.k;
        }

        @Override
        public V getValue() {
            return this.v;
        }

        @Override
        public V setValue(V value) {
            V old = v;
            v = value;
            return old;
        }

    }
    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return (size() == 0);
    }

    @Override
    public V get(K key) {
        return null;
    }

    @Override
    public V put(K key, V value) {
        return value;
    }

    @Override
    public V remove(K key) {
        return null;
    }
    private class KeyIterator implements Iterator<K>{
       private Iterator<Entry<K,V>> entry = entrySet().iterator();
        @Override
        public boolean hasNext() {
            return entry.hasNext();
        }

        @Override
        public K next() {
            return (K)entry.next().getKey();
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }
   private class KeyIterable implements Iterable<K>{

       @Override
       public Iterator<K> iterator() {
           return new KeyIterator();
       }
   }

    @Override
    public Iterable keySet() {
        return new KeyIterable();
    }
    private class ValueIterator implements Iterator<V>{
        private Iterator<Entry<K,V>> entry = entrySet().iterator();
        @Override
        public boolean hasNext() {
            return entry.hasNext();
        }

        @Override
        public V next() {
            return entry.next().getValue();
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }
    private class ValueIterable implements Iterable<V>{

        @Override
        public Iterator<V> iterator() {
            return new ValueIterator();
        }
    }
    @Override
    public Iterable values() {
        return new ValueIterable();
    }
    private class EntryIterator implements Iterator<Entry<K , V>>{

        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public Entry<K, V> next() {
            return null;
        }


    }
    @Override
    public Iterable<Entry<K,V>> entrySet() {
        return null;
    }
}
