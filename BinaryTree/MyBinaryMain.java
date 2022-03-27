package com.Bridgelabz.HashMap.BinaryTree;

public class MyBinaryMain {

	public static void main(String[] args) {

		MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree<>();
		myBinaryTree.add(56);
		myBinaryTree.add(30);
		myBinaryTree.add(70);

		myBinaryTree.searchBST(30);
		int size = myBinaryTree.getSize();
		System.out.println("Size of binary tree is: " + size);
		System.out.println("Binary Tree is :");
		myBinaryTree.print();
	}
}
