package Algorithms.DataStructures;

import java.util.ArrayList;
import java.util.List;

public class Stack<T> {

    List<T> m_Items = new ArrayList<T>();

    public synchronized void Push(T item) {
        m_Items.add(item);
    }

    public synchronized T Pop() {
        if (!isEmpty()) {
            return m_Items.remove(m_Items.size() - 1);
        }

        return null;
    }

    public synchronized boolean isEmpty() {
        return m_Items.isEmpty();
    }
}
