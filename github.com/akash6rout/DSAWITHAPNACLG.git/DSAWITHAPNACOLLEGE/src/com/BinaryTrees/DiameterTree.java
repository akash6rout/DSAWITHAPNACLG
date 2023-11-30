package com.BinaryTrees;

public class DiameterTree {
	public class Node{
		int data;
		Node left,right;
		
		public Node(int data) {
			this.data=data;
			this.left=null;
			this.right=null;
		}
	}
	public static int diameter2(Node root) {
		if(root==null) {
			return 0;
		}
		int leftDiameter=diameter2(root.left);
		int leftHeight=diameter2(root.left);
		int rightDiameter=diameter2(root.right);
		int rightHeight=diameter2(root.right);
		
		int selfDiameter=leftHeight+rightHeight+1;
		
		return Math.max(selfDiameter, Math.max(leftDiameter, rightDiameter));
		
	}
	static class Info{
		int diameter;
		int height;
		public Info(int diameter, int height) {
			super();
			this.diameter = diameter;
			this.height = height;
		}
		
	}
	public static Info diameter(Node root) {//o(n)
		if(root==null) {
			return new Info(0, 0);
		}
		Info leftInfo=diameter(root.left);
		Info rightInfo=diameter(root.right);
		
		int diam=Math.max(Math.max(leftInfo.diameter, rightInfo.diameter),leftInfo.height+rightInfo.height+1);
		int ht=Math.max(leftInfo.height, rightInfo.height)+1;
		
		return new Info(diam, ht);
	}
	public static void main(String[] args) {
		
		DiameterTree heightOfNode=new DiameterTree();
		Node root = heightOfNode.new Node(1);
        root.left = heightOfNode.new Node(2);
        root.right = heightOfNode.new Node(3);
        root.left.left = heightOfNode.new Node(4);
        root.left.right = heightOfNode.new Node(5);
        root.right.left = heightOfNode.new Node(6);
        root.right.right = heightOfNode.new Node(7);
        
        System.out.println(diameter(root).diameter);
	}

}
