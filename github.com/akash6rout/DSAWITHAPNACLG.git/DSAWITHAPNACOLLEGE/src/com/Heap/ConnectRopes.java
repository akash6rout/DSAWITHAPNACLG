package com.Heap;

import java.util.PriorityQueue;

public class ConnectRopes {
	
	public static void main(String[] args) {
		
		int ropes[]= {2,3,3,4,6};
		
		PriorityQueue<Integer> pQueue=new PriorityQueue<>();
		for(int i=0;i<ropes.length;i++) {
			pQueue.add(ropes[i]);
		}
		
		int cost=0;
		while(pQueue.size()>1) {
			int min=pQueue.remove();
			int min2=pQueue.remove();
			cost=cost+min+min2;
			pQueue.add(min+min2);
		}
		System.out.println("cost of connecting n ropes ="+cost);
	}

}
