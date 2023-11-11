package com.LinkedList;

import java.util.LinkedList;

public class LinkedLLMergeSortLL {
	public static class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data=data;
			this.next=null;
		}
		
	}

	private Node merge(Node head1, Node head2) {
		Node mergedLL = new Node(-1);
		Node temp = mergedLL;

		while (head1 != null && head2 != null) {
			if (head1.data <= head2.data) {
				temp.next = head1;
				head1 = head1.next;
				temp = temp.next;
			} else {
				temp.next = head2;
				head2 = head2 = head2.next;
				temp = temp.next;
			}
		}
		while(head1!=null) {
			temp.next=head1;
			head1=head1.next;
			temp=temp.next;
		}
		
		while(head2!=null) {
			temp.next=head2;
			head2=head2.next;
			temp=temp.next;
		}
		return mergedLL.next;
	}
	private Node getMid(Node head) {
		Node slow=head;
		Node fast=head.next;
		
		while(fast !=null&&fast.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
		}
		return slow;
	}

	public Node mergeSort(Node head) {
		if (head == null || head.next != null) {
			return head;
		}
		// find mid
		Node mid = getMid(head);
		// left & right haf
		Node rightHead = mid.next;
		mid.next = null;
		Node newLeft = mergeSort(head);
		Node newRight = mergeSort(rightHead);

		// merge
		return merge(newLeft, newRight);
	}

	public static void main(String[] args) {

		LinkedList<Integer> ll=new LinkedList<>();
		
	}

}
