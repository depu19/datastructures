package com.learn.datastructures.stack;

public class MinTrackingStack<T extends Integer> {
    private Node<T> top;
    private int size;
    private int counter;
    private final Stack minValueInStack;

    public MinTrackingStack(int size) {
        this.size = size;
        minValueInStack = new Stack(size);
    }

    static class Node<T> {
        private T data;
        private Node<T> next;

        public Node(T data, Node<T> next) {
            this.data = data;
            this.next = next;
        }
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void push(T data) {
        counter++;
        if (counter > size) {
            throw new RuntimeException("Stack is full");
        }

        if (isEmpty()) {
            minValueInStack.push(data);
            Node newNode = new Node(data, null);
            top = newNode;
        } else {
            addMinValueToMinStack(data);
            Node<T> temp = top;
            Node newNode = new Node(data, null);
            top = newNode;
            top.next = temp;
        }

    }

    private void addMinValueToMinStack(Integer data) {
        if (minValueInStack.isEmpty()) {
            minValueInStack.push(data);
        } else if (minValueInStack.peek() >= data) {
            minValueInStack.push(data);
        }

    }

    private void removeMinValueFromMinStack(Integer data) {

        if (minValueInStack.peek() == data) {
            minValueInStack.pop();
        }
    }

    public T peek() {
        if (!isEmpty()) return top.data;
        throw new RuntimeException("Stack is empty");
    }

    public T pop() {

        if (!isEmpty()) {
            counter--;
            Node<T> temp = top;
            top = temp.next;
            removeMinValueFromMinStack(temp.data);
            return temp.data;
        }
        throw new RuntimeException("Stack is empty");
    }

    public int min() {
        return minValueInStack.peek();
    }

}
