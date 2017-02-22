package Algorithms.WhiteboadQs;

import java.util.Stack;

public class QueueAsStack<T> {

    private final Stack<T> popStack = new Stack<T>();
    private final Stack<T> insertStack = new Stack<T>();

    public void enqueue(T o) {

        if(popStack.isEmpty()) {
            popStack.push(o);
        } else {

            while (!popStack.isEmpty()) {
                insertStack.push(popStack.pop());
            }

            popStack.push(o);

            while (!insertStack.isEmpty()) {
                popStack.push(insertStack.pop());
            }
        }
    }

    public T dequeue() {

        return popStack.pop();
    }

    public T peek() {
        return popStack.peek();
    }

    public boolean isEmpty() {
        return popStack.isEmpty();
    }
}
