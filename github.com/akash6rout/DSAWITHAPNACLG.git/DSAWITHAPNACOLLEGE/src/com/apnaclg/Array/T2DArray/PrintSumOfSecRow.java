package com.apnaclg.Array.T2DArray;

public class PrintSumOfSecRow {
	
	public static void main(String[] args) {
		
		int arr[][]= {{1,4,9},{11,4,3},{2,2,3}};
		int sum=0;
		
		//sum of 2nd row element
		for(int j=0;j<arr[0].length;j++) {
			sum=sum+arr[1][j];
		}
		System.out.println("Sum of seconf row is 11+4+3=>>"+sum);
	}

}
