package com.learn.datastructures.stack;

import com.learn.datastructures.linkedlist.LinkedList;
import com.learn.datastructures.queue.Queue;

public class Runner {
    public static void main(String[] args) {
        stack();

    }

    private static void linkedList() {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.addFirst(1);
        linkedList.addFirst(2);
        linkedList.addFirst(3);
        linkedList.addFirst(4);
        linkedList.addLast(0);

        linkedList.traverse();

        linkedList.removeFirst();

        System.out.println("----");

        linkedList.traverse();
    }

    private static void queue() {
        Queue<Integer> queue = new Queue<>() ;
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
    }

    private static void stack() {
        MinTrackingStack<Integer> stack = new MinTrackingStack(10);
        stack.push(18);
        stack.push(19);
        stack.push(29);
        stack.push(16);
        stack.push(16);
        System.out.println("MIN " +stack.min());
        System.out.println("POPPED "+ stack.pop());
        System.out.println("MIN " +stack.min());
        System.out.println("POPPED "+ stack.pop());
        System.out.println("MIN " +stack.min());
        stack.push(15);
        System.out.println("MIN " +stack.min());
        stack.push(26);
        System.out.println("MIN " +stack.min());
        stack.push(2);
        System.out.println("MIN " +stack.min());
        System.out.println("POPPED "+ stack.pop());
        System.out.println("POPPED "+ stack.pop());
        System.out.println("POPPED "+ stack.pop());
        System.out.println("POPPED "+ stack.pop());
        System.out.println("POPPED "+ stack.pop());
        System.out.println("POPPED "+ stack.pop());
        System.out.println("MIN " +stack.min());
    }
}
