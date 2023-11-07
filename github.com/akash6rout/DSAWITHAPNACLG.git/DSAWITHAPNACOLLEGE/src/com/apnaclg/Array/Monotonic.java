package com.apnaclg.Array;

public class Monotonic {

	public static boolean isIncreasing(int arr[], int n) {
		for (int i = 0; i < n - 1; i++) {
			if (arr[i] > arr[i + 1])// next element should not be smaller
			{
				return false;
			}
		}
		return true;
	}

	public static boolean isDecreasing(int arr[], int n) {
		for (int i = 0; i < n - 1; i++) {
			if (arr[i] < arr[i + 1])// next element should not be larger
			{
				return false;
			}
		}
		return true;
	}

	public static boolean isMonotonic(int arr[], int n) {
		boolean increasing = isIncreasing(arr, n);
		boolean decreasing = isDecreasing(arr, n);

		return increasing || decreasing;
	}

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 1 };
		int n = arr.length;
		System.out.println(isMonotonic(arr, n));

	}
}
