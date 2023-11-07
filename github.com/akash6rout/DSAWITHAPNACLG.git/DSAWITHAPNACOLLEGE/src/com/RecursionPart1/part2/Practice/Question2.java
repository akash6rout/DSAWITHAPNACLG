package com.RecursionPart1.part2.Practice;

/*
 * Question 2 :You are given a number (eg -  2019), convert it into a String of english like
 * “two zero one nine”.  Use a recursive function to solve this problem.
 * NOTE-Thedigitsofthenumberwillonlybeintherange0-9andthelastdigitofanumbercan’t be 0.
 * Sample Input: 1947Sample Output: “one nine four seven”*/

public class Question2 {
	
	public static String digits[]= {"zero","one","two","three","four","five","six","seven","eight","nine"};
	
	public static void printDigits(int number) {
		if(number == 0) {
			return;
		}
		
		int lastDigit=number%10;
		printDigits(number/10);
		System.out.println(digits[lastDigit]+" ");
	}
	
	public static void main(String[] args) {
		
		printDigits(4321);
		
	}

}
