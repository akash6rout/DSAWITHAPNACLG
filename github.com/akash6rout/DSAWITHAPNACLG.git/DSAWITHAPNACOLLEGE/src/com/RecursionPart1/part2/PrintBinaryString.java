package com.RecursionPart1.part2;

public class PrintBinaryString {
	
	public static void printBinString(int n,int lastPlace,StringBuilder str) {
		
		//work
		/*if(lastPlace==0) {
			//sit 0 on chair n
			printBinString(n-1, 0, str.append("0"));
			printBinString(n-1, 1, str.append("1"));
		}else {
			printBinString(n-1, 0, str.append("0"));
		}*/
		//base case
		if(n==0) {
			System.out.println(str);
			return;
		}
		printBinString(n-1, 0, str.append("0"));
		if(lastPlace==0) {
			printBinString(n-1, 1, str.append("1"));
		}
	}
	
	public static void main(String[] args) {
		printBinString(3, 0, new StringBuilder(""));
		
	}

}
