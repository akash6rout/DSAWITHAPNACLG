package com.function;


import java.util.Scanner;

public class CalculateSum {
    public static int calculateSum(int num1, int num2) {
        int sum = num1 + num2;
        //System.out.println(sum);
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();
        int sum1=calculateSum(a, b);
        System.out.println(sum1+"Total sum is");
    }

}
