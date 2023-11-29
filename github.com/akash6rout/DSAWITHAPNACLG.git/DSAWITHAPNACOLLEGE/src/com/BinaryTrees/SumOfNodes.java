package com.BinaryTrees;

public class SumOfNodes {
	
	public class Node{
		int data;
		Node left,right;
		
		public Node(int data) {
			this.data=data;
			this.left=null;
			this.right=null;
		}
	}
	public static int sum(Node root) {
		if(root==null) {
			return 0;
		}
		int leftSum=sum(root.left);
		int rightSum=sum(root.right);
		
		return leftSum+rightSum+root.data;
	}
	 
	public static void main(String[] args) {
		SumOfNodes heightOfNode=new SumOfNodes();
		Node root = heightOfNode.new Node(1);
        root.left = heightOfNode.new Node(2);
        root.right = heightOfNode.new Node(3);
        root.left.left = heightOfNode.new Node(4);
        root.left.right = heightOfNode.new Node(5);
        root.right.left = heightOfNode.new Node(6);
        root.right.right = heightOfNode.new Node(7);

       System.out.println(sum(root));
	}

}
