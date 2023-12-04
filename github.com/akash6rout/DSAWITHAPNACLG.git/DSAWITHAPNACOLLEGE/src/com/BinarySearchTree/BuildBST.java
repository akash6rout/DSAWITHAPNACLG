package com.BinarySearchTree;

public class BuildBST {
	
	static class Node{
		int data;
		Node leftNode;
		Node rightNode;
		
		Node(int data){
			this.data=data;
		}
	}
	public static Node insert(Node root,int val) {
		if(root==null) {
			root=new Node(val);
			return root;
		}
		if(root.data>val) {
			//left subtree
			root.leftNode=insert(root.leftNode, val);
		}else {
			//right subtree
			root.rightNode=insert(root.rightNode, val);
		}
		return root;
	}
	public static void inorder(Node root) {
		if(root==null) {
			return;
		}
		inorder(root.leftNode);
		System.out.println(root.data+" ");
		inorder(root.rightNode);
	}
	public static boolean search(Node root,int key) {
		if(root==null) {
			return false;
		}
		if(root.data==key) {
			return true;
		}
		if(root.data>key) {
			return search(root.leftNode, key);
		}
		
		else {
			return search(root.rightNode, key);
		}
	}
	
	public static void main(String[] args) {
		
		int values[]= {5,1,3,4,2,7};
		Node rootNode=null;
		
		for(int i=0;i<values.length;i++) {
			rootNode=insert(rootNode, values[i]);
		}
		inorder(rootNode);
		System.out.println();
		
		if(search(rootNode, 6)) {
			System.out.println("Found");
		}else {
			System.out.println("Not Found");
		}
	}

}
