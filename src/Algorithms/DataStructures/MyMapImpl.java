package Algorithms.DataStructures;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MyMapImpl<K, V> {

    private int size;
    private int DEFAULT_CAPACITY = 10;

    @SuppressWarnings("unchecked")
    private HashEntry<K, V>[] values = new HashEntry[DEFAULT_CAPACITY];

    public V get(K key) {

        for (int i = 0; i < size; i++) {
          if(values[i].getKey().equals(key)) {
              return values[i].getValue();
          }
        }
        return null;
    }

    public void put(K key, V value) {

        boolean insert = true;
        for(int i = 0; i < size; i++) {
            if(values[i].getKey().equals(key)) {
                values[i].setValue(value);
                insert = false;
            }
        }

        if(insert) {
            resize();
            values[size++] = new HashEntry<>(key, value);
        }
    }

    public void resize() {
        if(size == values.length) {
            int newSize = values.length * 2;
            values = Arrays.copyOf(values, newSize);
        }
    }

    public int size() {
        return size;
    }

    public void remove(K key) {
        for (int i = 0; i < size; i++) {
            if(values[i].getKey().equals(key)) {
                values[i] = null;
                size--;
                condenseArray(i);
            }
        }
    }

    private void condenseArray(int start) {
        for (int i = 0; i < start; i++) {
            values[i] = values[i + 1];
        }
    }

    public Set<K> keySet() {
        Set<K> set = new HashSet<>();
        for (int i = 0; i < size; i++) {
            set.add(values[i].getKey());
        }
        return set;
    }
}
