package com.learn.datastructures.linkedlist;

public class LinkedList<T> {

    private Node<T> head;

    static class Node<T> {
        T data;
        Node<T> next;
    }

    public void addFirst(T data) {
        Node<T> newNode = new Node<>();
        newNode.data = data;
        if (isEmpty()) {
            head = newNode;
        } else {
            Node<T> temp = head;
            head = newNode;
            head.next = temp;
        }
    }

    public void removeFirst(){
        if(!isEmpty()){
            Node<T> temp = head;
            System.out.println("Removing "+temp.data);
            head = temp.next;
        }
    }

    public void addLast(T data) {
        Node<T> newNode = new Node<>();
        newNode.data = data;
        if (isEmpty()) {
            head = newNode;
        } else {
            Node<T> traverse = head;
            while(traverse.next !=null){
                traverse= traverse.next;
            }
            traverse.next = newNode;
        }
    }


    public void traverse() {
        if (!isEmpty()) {
            Node<T> traverseNode = head;
            while (traverseNode != null) {
                System.out.println(traverseNode.data);
                traverseNode = traverseNode.next;
            }
        }
    }

    public boolean isEmpty() {
        return head == null;
    }
}
