package com.RecursionPart1.part2;

public class TilingProblem {
	
	public static int tilingProblem(int n)
	{
		//base case
		if(n==0 || n==1) {
			return 1;
		}
		
		//work
		//vertical choice
		int fun1=tilingProblem(n-1);
		
		//horizontal choice
		int fun2=tilingProblem(n-2);
		
		int twoWaya=fun1+fun2;
		
		return twoWaya;
	}
	public static void main(String[] args) {
		
		System.out.println(tilingProblem(2));
	}

}
