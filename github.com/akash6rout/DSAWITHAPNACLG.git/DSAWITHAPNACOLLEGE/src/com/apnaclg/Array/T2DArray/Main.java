package com.apnaclg.Array.T2DArray;

import java.util.Scanner;

public class Main {

	public static int LargestElement(int matrix[][]) {
		int lelement = Integer.MIN_VALUE;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (matrix[i][j] > lelement) {
					lelement = matrix[i][j];
				}
			}
		}
		return lelement;
	}

	public static int smallestElement(int matrix[][]) {
		int lelement = Integer.MAX_VALUE;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (matrix[i][j] < lelement) {
					lelement = matrix[i][j];
				}
			}
		}
		return lelement;
	}

	public static boolean search(int matrix[][], int key) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the key you want to search");
		key = sc.nextInt();
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (matrix[i][j] == key) {
					System.out.println("key found at cell(" + i + "," + j + ")");
					return true;
				}
			}
		}
		System.out.println("key not found");
		return false;
	}

	public static void main(String[] args) {
		int matrix[][] = new int[3][3];
		int row = matrix.length;
		int col = matrix[0].length;

		Scanner sc = new Scanner(System.in);
		System.out.println("create your 2d array");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		// output
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

		// search(matrix, 5);
		// System.out.println(LargestElement(matrix));
		System.out.println(smallestElement(matrix));
	}

}
