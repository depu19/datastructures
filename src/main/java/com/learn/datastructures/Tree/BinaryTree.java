package com.learn.datastructures.Tree;

public class BinaryTree<T> {

    private Node<T> root;

    static class Node<T> {
        private T data;
        private Node<T> left;
        private Node<T> right;

        public Node(T data, Node<T> left, Node<T> right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    public static void main(String[] args) {
        BinaryTree<String> stringBinaryTree = new BinaryTree<>();
       // stringBinaryTree.root= new Node<>();
    }
}
