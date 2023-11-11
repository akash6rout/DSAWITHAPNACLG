package com.apnaclg.Array.T2DArray;

public class TransposeMatrix {

	    public static void main(String[] args) {
	        // Example 2D array
	        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

	        // Print the original matrix
	        System.out.println("Original Matrix:");
	        printMatrix(matrix);

	        // Transpose the matrix
	        int[][] transposedMatrix = transpose(matrix);

	        // Print the transposed matrix
	        System.out.println("\nTransposed Matrix:");
	        printMatrix(transposedMatrix);
	    }

	    // Function to transpose a 2D array
	    public static int[][] transpose(int[][] matrix) {
	        int rows = matrix.length;
	        int columns = matrix[0].length;

	        int[][] transposedMatrix = new int[columns][rows];

	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < columns; j++) {
	                transposedMatrix[j][i] = matrix[i][j];
	            }
	        }

	        return transposedMatrix;
	    }

	    // Function to print a 2D array
	    public static void printMatrix(int[][] matrix) {
	        for (int[] row : matrix) {
	            for (int value : row) {
	                System.out.print(value + " ");
	            }
	            System.out.println();
	        }
	    }
	}

