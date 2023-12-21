package com.PlusLibAlpha;

public class IntersectionOfTwoLinkedList {

	static class Node{
		int val;
		Node next;
	}
	static Node newNode(int key) {
		Node temp=new Node();
		temp.val=key;
		temp.next=null;
		return temp;
	}
	static Node intersect(Node l1,Node l2) {
		if(l1==null || l2==null) return null;
		
		Node p1=l1,p2=l2;
		
		while(p1!=p2) {
			p1=p1==null ? l2:p1.next;
			p2=p2==null ? l1:p2.next;
		}
		return p1;
		
	}
	public static void main(String[] args) {
		Node newNode;
		Node head1=new Node();
		head1.val=1;
		newNode=new Node();
		newNode.val=2;
		head1.next=newNode;
		Node head2=new Node();
		head2.val=3;
		newNode=new Node();
		newNode.val=4;
		head2.next=newNode;
	}
}
