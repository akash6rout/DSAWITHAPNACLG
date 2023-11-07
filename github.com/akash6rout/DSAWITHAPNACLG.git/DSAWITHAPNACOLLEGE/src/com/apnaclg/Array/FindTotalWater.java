package com.apnaclg.Array;

public class FindTotalWater {
	public static int findTotalWaterCount(int arr[],int n) {
		int lmax[]=new int[n];
		
		int max=0;
		for(int i=0;i<n;i++) {
			max=Math.max(max, arr[i]);
			lmax[i]=max;
		}
		
		int rmax[]=new int[n];
		max=0;
		
		for(int i=n-1;i>=0;i--) {
			max=Math.max(max, arr[i]);
			rmax[i]=max;
		}
		
		int totalwater=0;
		for(int i=0;i<n;i++) {
			int lb=lmax[i];
			int rb=rmax[i];
			
			int min=Math.min(lb, rb);
			int currentwater=min-arr[i];
			totalwater=totalwater+currentwater;
		}
		return totalwater;
	}
	public static void main(String[] args) {
		
		
	}

}
