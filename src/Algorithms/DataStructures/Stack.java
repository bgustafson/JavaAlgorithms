package Algorithms.DataStructures;

import java.util.ArrayList;
import java.util.List;

public class Stack<T> {

    private List<T> m_Items = new ArrayList<>();

    public synchronized void push(T item) {
        m_Items.add(item);
    }

    public synchronized T pop() {
        if (!isEmpty()) {
            return m_Items.remove(m_Items.size() - 1);
        }

        return null;
    }

    public synchronized T peek() {
        if (!isEmpty()) {
            return m_Items.get(m_Items.size() - 1);
        }

        return null;
    }

    public synchronized boolean isEmpty() {
        return m_Items.isEmpty();
    }
}
