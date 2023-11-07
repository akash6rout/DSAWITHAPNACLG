package com.RecursionPart1.part2.Practice;

/*
 * Question4:WearegivenastringS,weneedtofindthecountofallcontiguoussubstringsstarting 
 * and ending with the same character.
 * Sample Input 1: S = "abcab"Sample Output 1: 7There are 15 substrings of "abcab" : a, ab, abc, abca, abcab, b, bc, bca, bcab, c, ca, cab, a, ab, b
 * Outoftheabovesubstrings,thereare7substrings:a,abca,b,bcab,c,aandb.So,only7contiguous substrings start and end with the same character.
 * */

public class Question4 {
	
	public static int countSubstrs(String str,int i,int j,int n) {
		if(n==1) {
			return 1;
		}
		if(n<=0) {
			return 0;
		}
		int res=countSubstrs(str, i+1, j, n-1)+
		countSubstrs(str, i, j-1, n-1)-
		countSubstrs(str, i+1, j-1, n-2);
		
		if(str.charAt(i)==str.charAt(j)) {
			res++;
		}
		return res;
	}
	
	public static void main(String[] args) {
		String string="abcab";
		int n=string.length();
		System.out.println(countSubstrs(string, 0, n-1, n));
	}

}
