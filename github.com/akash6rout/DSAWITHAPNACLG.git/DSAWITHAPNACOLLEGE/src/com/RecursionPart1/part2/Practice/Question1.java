package com.RecursionPart1.part2.Practice;

/*
 * uestion1:ForagivenintegerarrayofsizeN.
 * Youhavetofindalltheoccurrences(indices)ofagivenelement(Key)andprintthem.
 * Usearecursivefunctiontosolvethisproblem.
 * Sample Input: arr[ ] = {3, 2, 4, 5, 6, 2, 7, 2, 2},key = 2Sample 
 * Output: 1 5 7 8
 */

public class Question1 {

	public static void allOccurence(int arr[], int key, int i) {
		if (i == arr.length) {
			return;
		}

		if (arr[i] == key) {
			System.out.println(i + " ");
		}
		allOccurence(arr, key, i + 1);
	}

	public static void main(String[] args) {
		int arr[] = { 3, 2, 4, 5, 6, 2, 7, 2, 2 };
		int key = 2;
		allOccurence(arr, key, 0);
		System.out.println();

	}

}
