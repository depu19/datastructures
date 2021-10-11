package com.learn.datastructures.Tree;

public class BinarySearchTree {

    private Node root;

    public void add(int element) {
        Node newNode = new Node(element);
        if (root == null) {
            root = newNode;
        } else {
            traverseAndAdd(newNode);
        }
    }

    private void traverseAndAdd( Node nodeToAdd) {

        while (root != null) {
            if (nodeToAdd.data < root.data) {
                if (root.left != null) {
                    root = root.left;
                } else {
                    root.left = nodeToAdd;
                    break;
                }

            } else if (nodeToAdd.data > root.data) {
                if (root.right != null) {
                    root = root.right;
                } else {
                    root.right = nodeToAdd;
                    break;
                }
            }
        }

    }


    static class Node {
        private int data;
        private Node left;
        private Node right;

        public Node(int data) {
            this.data = data;
        }
    }
}
