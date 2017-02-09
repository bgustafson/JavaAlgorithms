package Algorithms.WhiteboadQs;

import java.util.Stack;

public class QueueAsStack<T> {

    private final Stack<T> _popStack = new Stack<T>();
    private final Stack<T> _insertStack = new Stack<T>();

    public void enqueue(T o) {

        _insertStack.push(o);
    }

    public T dequeue() {

        if (_popStack.size() == 0) {
            while (_insertStack.size() > 0) {
                _popStack.push(_insertStack.pop());
            }
        }

        return _popStack.pop();
    }

    public T peek() {
        return _popStack.peek();
    }
}
