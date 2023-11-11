package com.apnaclg.Array.T2DArray;

public class SearchNumber {
	
	public static void main(String[] args) {
		
		int arr[][]= {{4,7,8},{8,8,7}};
		int countNumber7=0;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				if(arr[i][j]==7) {
					countNumber7++;
				}
			}
		}
		System.out.println("count Number is "+countNumber7);
	}

}
