package com.Graph;

import java.util.ArrayList;

public class CreatingGraph {
	static class Edge{
		int src;
		int dest;
		int wt;
		
		public Edge(int s,int d,int w) {
			this.src=s;
			this.dest=d;
			this.wt=w;
		}
	}

	public static void main(String[] args) {
		
		int V=5;
		ArrayList<Edge> graph[]=new ArrayList[V];
		for(int i=0;i<V;i++) {
			graph[i]=new ArrayList<>();
		}
		//0 -vertix
		graph[0].add(new Edge(0, 1, 5));
		
		//1 vertix
		graph[1].add(new Edge(1, 0, 5));
		
		graph[1].add(new Edge(1, 0, 5));
		graph[1].add(new Edge(1, 2, 1));
		graph[1].add(new Edge(1, 3, 3));
		
		//2 vertix
		graph[2].add(new Edge(2, 1, 1));
		graph[2].add(new Edge(2, 3, 1));
		graph[2].add(new Edge(2, 4, 4));
		
		//3 vertix
		graph[3].add(new Edge(3, 1, 3));
		graph[3].add(new Edge(3, 2, 1));
		
		//4 vertix
		graph[4].add(new Edge(4, 2, 2));
		
		//2's neighbors
		for(int i=0;i<graph[2].size();i++) {
			Edge edge=graph[2].get(i);
			System.out.println(edge.dest);
		}
	}
}
