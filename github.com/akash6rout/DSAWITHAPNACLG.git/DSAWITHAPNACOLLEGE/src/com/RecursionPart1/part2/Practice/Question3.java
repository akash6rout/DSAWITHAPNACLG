package com.RecursionPart1.part2.Practice;

/*
 * Question 3 :Write a program to findLength of aStringusing Recursion*/

public class Question3 {
	public static int length(String str) {
		if(str.length()==0) {
			return 0;
		}
		return length(str.substring(1))+1;
	}
	public static void main(String[] args) {
		String str="abcde";
		System.out.println(length(str));
	}

}
