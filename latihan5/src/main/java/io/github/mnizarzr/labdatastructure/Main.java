package io.github.mnizarzr.labdatastructure;

public class Main {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.newNode(20);
        binaryTree.newNode(2);
        binaryTree.newNode(25);
        binaryTree.newNode(37);
        binaryTree.newNode(16);

        System.out.println("Pre Order Traversal: ");
        binaryTree.preOrder(binaryTree.root);
        System.out.println("In Order Traversal: ");
        binaryTree.inOrder(binaryTree.root);
        System.out.println("Post Order Traversal: ");
        binaryTree.postOrder(binaryTree.root);
    }
}