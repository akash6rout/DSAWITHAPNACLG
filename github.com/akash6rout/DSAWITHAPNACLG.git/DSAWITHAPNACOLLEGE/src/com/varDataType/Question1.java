package com.varDataType;

import java.util.Scanner;

public class Question1 {
    /*
     * Question 1 : In a program, input 3 numbers : A, B and C. You have to output
     * the average of
     * these 3 numbers.
     * (Hint : Average of N numbers is sum of those numbers divided by N
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number");
        double a = sc.nextInt();
        System.out.println("Enter Second Number");
        double b = sc.nextInt();
        System.out.println("Enter Thired Number");
        double c = sc.nextInt();

        double avg = (a + b + c) / 3;

        System.out.println("Average of three numbers\n" + avg);
    }
}
