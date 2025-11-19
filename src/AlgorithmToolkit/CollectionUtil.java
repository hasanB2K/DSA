package AlgorithmToolkit;

import java.util.LinkedList;

public class CollectionUtil {

    // ----------- STACK -----------
    public static class Stack<T> {
        private LinkedList<T> list = new LinkedList<>();

        public void push(T value) { list.addFirst(value); }
        public T pop() { return list.isEmpty() ? null : list.removeFirst(); }
        public T peek() { return list.isEmpty() ? null : list.getFirst(); }
        public boolean isEmpty() { return list.isEmpty(); }
    }

    // ----------- QUEUE -----------
    public static class Queue<T> {
        private LinkedList<T> list = new LinkedList<>();

        public void enqueue(T value) { list.addLast(value); }
        public T dequeue() { return list.isEmpty() ? null : list.removeFirst(); }
        public boolean isEmpty() { return list.isEmpty(); }
    }
}
