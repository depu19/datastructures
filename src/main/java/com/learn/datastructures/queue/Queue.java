package com.learn.datastructures.queue;

public class Queue<T> {
    private Node<T> head;
    private Node<T> tail;

    static class Node<T> {
        private T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
        }
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void enqueue(T data) {
        System.out.println("Adding to queue"+data);
        if(isEmpty()) {
            Node<T> newNode = new Node<>(data);
            head = newNode;
            tail = newNode;
        }
        else {
            Node<T> temp = tail;
            Node<T> newNode = new Node<>(data);
            temp.next = newNode;
            tail = newNode;
        }
    }

    public T dequeue() {
        if(!isEmpty()) {
            Node<T> temp = head;
            head = temp.next;
           return temp.data;
        }
        return null;
    }

}
