package com.Loop;

import java.util.Scanner;

public class Factorial {
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number");
        int num=sc.nextInt();//to hold number
        int fact=1;//to hold factorial
        for(int i=1;i<=num;i++)
        {
            fact=fact*i;
        }
        System.out.println(fact);
    }
}
