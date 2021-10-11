package com.learn.datastructures.stack;

public class Stack {

    private Stack.Node top;
    private int size;
    private int counter;

    public Stack(int size) {
        this.size = size;
    }

    static class Node  {
        private int data;
        private Node next;

        public Node(int data, Stack.Node next) {
            this.data = data;
            this.next = next;
        }
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void push(int data) {
        counter++;
        if(counter>size) {
            throw new RuntimeException("Stack is full");
        }

        if(isEmpty()) {
            Stack.Node newNode = new Stack.Node(data, null);
            top = newNode;
        }
        else {
            Stack.Node temp = top;
            Stack.Node newNode = new Stack.Node(data, null);
            top = newNode;
            top.next = temp;
        }

    }


    public int peek() {
        if(!isEmpty()) return top.data;
        throw  new RuntimeException("Stack is empty");
    }

    public int pop() {

        if(!isEmpty()) {
            counter--;
            Stack.Node temp = top;
            top = temp.next;
            return temp.data;
        }
        throw  new RuntimeException("Stack is empty");
    }



}
