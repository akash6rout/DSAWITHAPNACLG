package com.RecursionPart1;

public class PrintDecNo {

	public static void printDec(int n) {
		if(n==1) {
			System.out.println(n);
			return;
		}
		System.out.print(n+" ");
		printDec(n-1);
		
	}
	public static void printRevNo(int n) {
		if(n==1) {
			System.out.print(n+" ");
			return;
		}
		printRevNo(n-1);
		System.out.print(n+" ");
	}
	public static int printFact(int n) {
		if(n==0) {
			return 1;
		}
		
		int fn=n*printFact(n-1);
		return fn;
	}
	
	
	public static void main(String[] args) {
		//int n=10;
		//printDec(n);
		//printRevNo(n);
		int n=5;
		System.out.println(printFact(n));
	}
}
