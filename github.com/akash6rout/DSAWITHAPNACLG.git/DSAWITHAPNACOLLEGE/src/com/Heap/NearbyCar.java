package com.Heap;

import java.util.PriorityQueue;

public class NearbyCar {
	
	static class Point implements Comparable<Point>{
		int x;
		int y;
		int distSq;
		int index;
		
		public Point(int x,int y,int distSq,int index) {
			this.x=x;
			this.y=y;
			this.distSq=distSq;
			this.index=index;
		}

		@Override
		public int compareTo(Point p2) {
			
			return this.distSq-p2.distSq;//accending order
		}
	}
	
	public static void main(String[] args) {
		int pts[][]= {{3,3},{5,-1},{-2,4}};
		int k=2;
		
		PriorityQueue<Point> pQueue=new PriorityQueue<>();
		for(int i=0;i<pts.length;i++) {
			int distSq=pts[i][0]*pts[i][0]+pts[i][1]*pts[i][1];
			pQueue.add(new Point(pts[i][0], pts[i][1], distSq,i));
		}
		//nearest k cars
		for(int i=0;i<k;i++) {
			System.out.println("C"+pQueue.remove().index);
		}
	}

}
