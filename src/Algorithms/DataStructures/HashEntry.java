package Algorithms.DataStructures;

public class HashEntry<T, E> {

    private T key;
    private E value;

    HashEntry(T key, E value) {

        this.key = key;
        this.value = value;
    }

    public T getKey() {
        return key;
    }

    public E getValue() {
        return value;
    }
}
