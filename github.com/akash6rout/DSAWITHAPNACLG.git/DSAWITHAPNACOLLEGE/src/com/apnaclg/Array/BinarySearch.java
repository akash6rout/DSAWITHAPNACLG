package com.apnaclg.Array;

public class BinarySearch {
	public static void main(String[] args) {

		int arr[] = { 3, 9, 11, 14, 16, 19 };
		int n = arr.length;
		int target = 3;
		int ans = -1;
		int start = 0;
		int end = n - 1;

		while (start <= end) {
			int mid = (start + end) / 2;
			if (arr[mid] == target) {
				ans = mid;
				break;
			} else if (arr[mid] < target) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		System.out.println(ans);
	}
}
